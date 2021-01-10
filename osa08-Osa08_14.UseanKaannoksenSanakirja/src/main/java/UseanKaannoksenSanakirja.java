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

public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList<String>> lista;
    
    public UseanKaannoksenSanakirja() {
        this.lista = new HashMap<>();
    }
    
    public void lisaa(String sana, String kaannos) {
        this.lista.putIfAbsent(sana, new ArrayList<String>());
        this.lista.get(sana).add(kaannos);
    }
    
    public ArrayList<String> kaanna(String sana) {
        ArrayList<String> tyhja = new ArrayList<>();
        if (this.lista.get(sana) == null) return tyhja;
        return lista.get(sana);
    }
    
    public void poista(String sana) {
        lista.remove(sana);
    }
}
