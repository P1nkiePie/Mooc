/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class Kirja implements Talletettava {
    private String kirjoittaja;
    private String nimi;
    private double paino;
    
    public Kirja(String kirjoittaja, String kirjanNimi, double paino) {
        this.kirjoittaja = kirjoittaja;
        this.nimi = kirjanNimi;
        this.paino = paino;
    }
    
    public String getKirjoittaja() {
        return this.kirjoittaja;
    }
    
    public String getKirjanNimi() {
        return this.nimi;
    }
    
    public Double getPaino() {
        return this.paino;
    }
    
    @Override
    public double paino() {
        return this.paino;
    }
    
    @Override
    public String toString() {
        return this.kirjoittaja + ": " + this.nimi;
    }
    
}
