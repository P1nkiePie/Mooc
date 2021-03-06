/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Varasto {
    private Map<String, Integer> hinta;
    private Map<String, Integer> saldo;
    
    public Varasto() {
        this.hinta = new HashMap<>();
        this.saldo = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.hinta.put(tuote, hinta);
        this.saldo.put(tuote, saldo);
        
    }
    
    public int hinta(String tuote) {
        if (this.onkoTuotetta(tuote)) {
            return this.hinta.get(tuote);
        } else {
            return -99;
        }
    }
    
    public int saldo(String tuote) {
        if (this.saldo.keySet().contains(tuote)) {
            return this.saldo.get(tuote);
        } else {
            return 0;
        }
    }
    
    public boolean ota(String tuote) {
        if (this.saldo.keySet().contains(tuote) && this.saldo.get(tuote) > 0) {
            this.saldo.put(tuote, this.saldo.get(tuote)-1);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean onkoTuotetta(String tuote) {
        return this.saldo.keySet().contains(tuote);
    }
    
    public Set<String> tuotteet() {
        Set<String> tuotteet = new HashSet<>();
        for (String avain: this.saldo.keySet()) {
            tuotteet.add(avain);
        }
        return tuotteet;
    }
    
}
