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

public class Henkilo {
    private String nimi;
    private String osoite;
    
    public Henkilo(String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String getOsoite() {
        return this.osoite;
    }
    
    public String toString() {
        return this.nimi + "\n  " + this.osoite + "\n";
    }
}
