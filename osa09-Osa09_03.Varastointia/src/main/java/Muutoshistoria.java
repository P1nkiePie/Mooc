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

public class Muutoshistoria {
    private ArrayList<Double> muutosLista;
    
    public Muutoshistoria() {
        this.muutosLista = new ArrayList<>();
    }
    
    public void lisaa(double tilanne) {
        this.muutosLista.add(tilanne);
    }
    
    public void nollaa() {
        this.muutosLista.clear();
    }
    
    public double maxArvo() {
        double suurin = 0;
        if (this.muutosLista.isEmpty()) return 0;
        for (int i=0; i<this.muutosLista.size(); i++) {
            if (this.muutosLista.get(i)>suurin) {
                suurin = this.muutosLista.get(i);
            }
        }
        return suurin;
    }
    
    public double minArvo() {
        double pienin = 10000;
        if (this.muutosLista.isEmpty()) return 0;
        for (int i=0; i<this.muutosLista.size(); i++) {
            if (this.muutosLista.get(i)<pienin) {
                pienin = this.muutosLista.get(i);
            }
        }
        return pienin;
    }
    
    public double keskiarvo() {
        double summa = 0;
        if (this.muutosLista.isEmpty()) return 0;
        for (int i=0; i<this.muutosLista.size(); i++) {
            summa = summa + this.muutosLista.get(i);
        }
        return 1.0*summa/this.muutosLista.size();
    }
    
    @Override
    public String toString() {
        String tuloste = "";
        for (int i=0; i<this.muutosLista.size(); i++) {
            tuloste = tuloste + this.muutosLista.get(i);
            if(!(i == this.muutosLista.size() -1)) {
                tuloste = tuloste + ", ";
            }
        }
        return "[" + tuloste + "]";
    }
}
