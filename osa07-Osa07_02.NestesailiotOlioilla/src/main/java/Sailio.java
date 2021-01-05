/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class Sailio {
    private int sailio;
    
    public Sailio() {
        
    }
    
    public int sisalto() {
        return this.sailio;
    }
    
    public void lisaa(int maara) {
        this.sailio = this.sailio + maara;
        if (maara < 0) {
            int luku = Math.abs(maara);
            this.sailio = this.sailio + luku;
        }
        if (this.sailio > 100) {
            this.sailio = 100;
        }
    }
    
    public void poista(int maara) {
        this.sailio = this.sailio - maara;
        if (this.sailio < 0) {
            this.sailio = 0;
        }
    }
    
    public String toString() {
      return this.sailio + "/100";  
    }
    
}
