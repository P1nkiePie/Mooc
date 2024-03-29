/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
import java.util.*;

public class Hajautustaulu<K, V> {

    private ArrayList <Pari<K, V>>[] arvot;
    private int arvoja;

    public Hajautustaulu() {
        this.arvot = new ArrayList[32];
        this.arvoja = 0;
    }
    
    public V hae(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % this.arvot.length);
        if (this.arvot[hajautusArvo] == null) {
            return null;
        }
        ArrayList<Pari<K, V>> arvotIndeksissa = this.arvot[hajautusArvo];
        for (int i = 0; i < this.arvoja; i++) {
            if (arvotIndeksissa.get(i).getAvain().equals(avain)) {
                return arvotIndeksissa.get(i).getArvo();
            }
        }
        return null;
    }
    
    public void lisaa(K avain, V arvo) {
        ArrayList<Pari<K, V>> arvotIndeksissa = haeAvaimeenLittyvaLista(avain);
        int i = haeAvaimenIndeksi(arvotIndeksissa, avain);
        if (i < 0) {
            arvotIndeksissa.add(new Pari<>(avain, arvo));
            this.arvoja++;
        } else {
            arvotIndeksissa.get(i).setArvo(arvo);
        }
        if (1.0 * this.arvoja / this.arvot.length > 0.75) {
            kasvata();
        }
    }
    
    private ArrayList<Pari<K, V>> haeAvaimeenLittyvaLista(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % arvot.length);
        if (arvot[hajautusArvo] == null) {
            arvot[hajautusArvo] = new ArrayList<>();
        }
        return arvot[hajautusArvo];
    }

    private int haeAvaimenIndeksi(ArrayList<Pari<K, V>> lista, K avain) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAvain().equals(avain)) {
                return i;
            }
        }
        return -1;
    }
    
    private void kopioi(ArrayList<Pari<K, V>>[] uusi, int indeksista) {
        for (int i = 0; i < this.arvot[indeksista].size(); i++) {
            Pari<K, V> arvo = this.arvot[indeksista].get(i);
            int hajautusarvo = Math.abs(arvo.getAvain().hashCode() % uusi.length);
            if(uusi[hajautusarvo] == null) {
                uusi[hajautusarvo] = new ArrayList<>();
            }
            uusi[hajautusarvo].add(arvo);
        }
    }
    
    private void kasvata() {
        ArrayList<Pari<K, V>>[] uusi = new ArrayList[this.arvot.length * 2];
        for (int i = 0; i < this.arvot.length; i++) {
            kopioi(uusi, i);
        }
        this.arvot = uusi;
    }
    
    public V poista(K avain) {
        ArrayList<Pari<K, V>> arvotIndeksissa = haeAvaimeenLittyvaLista(avain);
        if (arvotIndeksissa.size() == 0) {
            return null;
        }
        int indeksi = haeAvaimenIndeksi(arvotIndeksissa, avain);
        if (indeksi < 0) {
            return null;
        }   
        Pari<K, V> pari = arvotIndeksissa.get(indeksi);
        arvotIndeksissa.remove(pari);
        return pari.getArvo();
    }
}