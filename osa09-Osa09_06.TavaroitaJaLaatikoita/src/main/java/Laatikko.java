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

public class Laatikko implements Talletettava {
    private double maxpaino;
    private ArrayList<Talletettava> laatikko;
    
    public Laatikko(double maxKapasiteetti) {
        this.maxpaino = maxKapasiteetti;
        this.laatikko = new ArrayList<>();
    }
    
    public void lisaa(Talletettava tavara) {
        if (this.paino() + tavara.paino() <= this.maxpaino) {
            laatikko.add(tavara);
        }
    }
    
    public double paino() {
        double paino = 0.0;
        for (Talletettava tavara: laatikko) {
            paino += tavara.paino();
        }
        return paino;
    }
    
    @Override
    public String toString() {
        return "Laatikko: " + this.laatikko.size() + " esinettä, paino yhteensä " + this.paino() + " kiloa";
    }
    
}
