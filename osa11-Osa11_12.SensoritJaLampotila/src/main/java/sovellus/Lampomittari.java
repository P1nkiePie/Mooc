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

public class Lampomittari implements Sensori{
    private boolean paalla;
    
    public Lampomittari() {
        this.paalla = false;
    }

    @Override
    public boolean onPaalla() {
        return this.paalla; 
    }

    @Override
    public void paalle() {
        this.paalla = true;
    }

    @Override
    public void poisPaalta() {
        this.paalla = false; 
    }

    @Override
    public int mittaa() {
        if (onPaalla() == false) {
            throw new IllegalStateException();
        }
        int min = -30;
        int max = 30;
        Random random = new Random();
        int luku = random.nextInt((max - min) + 1) + min;
        return luku;
    }
    
}
