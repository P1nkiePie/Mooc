/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class CDLevy implements Talletettava {
    private String artisti;
    private String levy;
    private int vuosi;
    
    public CDLevy(String artisti, String levy, int vuosi) {
        this.artisti = artisti;
        this.levy = levy;
        this.vuosi = vuosi;
    }
    
    public String getArtisti() {
        return this.artisti;
    }
    
    public String getLevynNimi() {
        return this.levy;
    }
    
    public Integer getJulkaisuVuosi() {
        return this.vuosi;
    }

    public double paino() {
        return 0.1;
    }
    
    @Override
    public String toString() {
        return this.artisti + ": " + this.levy + " (" + this.vuosi + ")";
    }
}
