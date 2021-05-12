/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

/**
 *
 * @author rontt
 */
import java.util.*;
public class Keskiarvosensori implements Sensori{
    private ArrayList<Sensori> sensorit;
    private ArrayList<Integer> arvot;

    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.arvot = new ArrayList<>();
    }
    
    @Override
    public boolean onPaalla() {
        for(Sensori i: sensorit) {
            if (i.onPaalla() == true) return true;
        }
        return false;
    }

    @Override
    public void paalle() {
        for (Sensori i: sensorit) {
            if(i.onPaalla() == false) i.paalle(); 
        }
    }

    @Override
    public void poisPaalta() {
         sensorit.get(new Random().nextInt(sensorit.size())).poisPaalta();
    }

    @Override
    public int mittaa() {
        if (sensorit.isEmpty()) throw new IllegalStateException("Ei mittareita");
        if (this.onPaalla() == false) throw new IllegalStateException("Virhe");
        int tulos = (int)sensorit.stream().mapToInt(s -> s.mittaa()).average().getAsDouble();
        arvot.add(tulos);
        return tulos; 
    }
    
    public void lisaaSensori(Sensori lisattava) {
        this.sensorit.add(lisattava);
    }
    
    public List<Integer> mittaukset() {
        return arvot;
    }
    
}
