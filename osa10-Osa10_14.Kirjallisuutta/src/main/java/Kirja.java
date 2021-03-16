/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class Kirja {
    private String kirjannimi;
    private int kohdeika;
    
    public Kirja(String nimi, int ika) {
        this.kirjannimi = nimi;
        this.kohdeika = ika;
    }
    
    public String getNimi() {
        return this.kirjannimi;
    }
    
    public int getIka() {
        return this.kohdeika;
    }
    
    @Override
    public String toString() {
        return this.kirjannimi + "(" + this.kohdeika + " vuotiaille ja vanhemmille)";
    }
}
