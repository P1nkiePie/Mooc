/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
import java.util.ArrayList;

public class Lista<T> {
    private T[] lista;
    private int arvoja;
    
    public Lista() {
        this.lista = (T[]) new Object[10];
        this.arvoja = 0;
    }
    
    public void lisaa(T arvo) {
        if(this.arvoja == this.lista.length) {
        kasvata();
    }
        this.lista[this.arvoja] = arvo;
        this.arvoja++;
    }
    
    private void kasvata() {
        int uusiKoko = this.lista.length + this.lista.length / 2;
        T[] uusi = (T[]) new Object[uusiKoko];
        for (int i = 0; i < this.lista.length; i++) {
            uusi[i] = this.lista[i];
        }
        this.lista = uusi;
    }
    
    public boolean sisaltaa(T arvo) {
        for (int i = 0; i < this.arvoja; i++) {
            if (this.lista[i].equals(arvo)) {
            return true;
            }
        }
        return false;
    }
    
    public void poista(T arvo) {
        int arvonIndeksi = arvonIndeksi(arvo);
        if (arvonIndeksi < 0) {
            return; // ei löydy
        }
        siirraVasemmalle(arvonIndeksi);
        this.arvoja--;
    }
    
    public int arvonIndeksi(T arvo) {
       for (int i = 0; i < this.arvoja; i++) {
            if (this.lista[i].equals(arvo)) {
                return i;
            }
        }
        return -1;
    }
    
    private void siirraVasemmalle(int indeksistaLahtien) {
        for (int i = indeksistaLahtien; i < this.arvoja - 1; i++) {
            this.lista[i] = this.lista[i + 1];
        }
    }
    
    public T arvo(int indeksi) {
        if (indeksi < 0 || indeksi >= this.arvoja) {
            throw new ArrayIndexOutOfBoundsException("Indeksi " + indeksi + " alueen [0, " + this.arvoja + "[ ulkopuolella.");
        }
        return this.lista[indeksi];
    }
    
    public int koko() {
        return this.arvoja;
    }
    
}
