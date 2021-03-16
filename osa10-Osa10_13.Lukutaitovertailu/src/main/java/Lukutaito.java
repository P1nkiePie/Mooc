/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class Lukutaito implements Comparable<Lukutaito> {
    private String sukupuoli;
    private String maa;
    private int vuosi;
    private double taitoprosentti;
    
    
    public Lukutaito(String sukupuoli, String maa, int vuosi, double taitoprosentti) {
        this.sukupuoli = sukupuoli;
        this.maa = maa;
        this.vuosi = vuosi;
        this.taitoprosentti = taitoprosentti;
    }
    
    public String getSukupuoli() {
        return this.sukupuoli;
    }
    
    public String getMaa() {
        return this.maa;
    }
    
    public int getVuosi() {
        return this.vuosi;
    }
    
    public double getTaitoprosentti() {
        return this.taitoprosentti;
    }
    
    @Override
    public int compareTo(Lukutaito lukutaito) {
        if (this.taitoprosentti < lukutaito.getTaitoprosentti()) return -1;
        if (this.taitoprosentti > lukutaito.getTaitoprosentti()) return 1;
        else return 0;
    }
    
    @Override
    public String toString() {
        return this.maa + " (" + this.vuosi + "), " + this.sukupuoli + ", " + this.taitoprosentti;
    }
    
}
