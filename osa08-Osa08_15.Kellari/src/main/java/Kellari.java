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
import java.util.HashMap;

public class Kellari {
    private HashMap<String, ArrayList<String>> kellari;
    
    public Kellari() {
        this.kellari = new HashMap<>();
    }
    
    public void lisaa(String komero, String tavara) {
        this.kellari.putIfAbsent(komero, new ArrayList<>());
        kellari.get(komero).add(tavara);
    }
    
    public ArrayList<String> sisalto(String komero) {
        ArrayList<String> sisalto = new ArrayList<>();
        if (this.kellari == null) return sisalto;
        if (this.kellari.get(komero) == null) return sisalto;
        return this.kellari.get(komero);
    }
    
    public void poista(String komero, String tavara) {
        kellari.get(komero).remove(tavara);
        if (kellari.get(komero).isEmpty()) kellari.remove(komero);
    }
    
    public ArrayList<String> komerot() {
        ArrayList<String> kellarit = new ArrayList<>();
        for (String numero: kellari.keySet()) {
            kellarit.add(numero);
        }
        return kellarit;
    }
    
}
