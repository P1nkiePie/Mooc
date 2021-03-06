/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
import java.util.Map;
import java.util.HashMap;

public class Ostoskori {
    private Map<String, Ostos> ostoskori;
    
    public Ostoskori() {
        this.ostoskori = new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta) {       
        Ostos ostos = new Ostos(tuote, 1, hinta);
        if (this.ostoskori.containsKey(tuote)) {
            this.ostoskori.get(tuote).kasvataMaaraa();
        } else {
            ostoskori.put(tuote, ostos);
        }
    }
    
    public int hinta() {
        int loppusumma = 0;
        for (Ostos ostos: this.ostoskori.values()) {
            loppusumma = loppusumma + ostos.hinta();
        }
        return loppusumma;
    }
    
    public void tulosta() {
        for (Ostos ostos: ostoskori.values()) {
            System.out.println(ostos);
        }
    }
}
