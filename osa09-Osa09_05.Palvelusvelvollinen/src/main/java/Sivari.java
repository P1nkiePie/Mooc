/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class Sivari implements Palvelusvelvollinen {
    private int paivia;
    
    public Sivari() {
        this.paivia = 362;
    }

    @Override
    public int paiviaJaljella() {
        return this.paivia;
    }

    @Override
    public void palvele() {
        this.paivia -= 1;
        if (this.paivia <= 0) {
            this.paivia = 0;
        }
    }
    
}
