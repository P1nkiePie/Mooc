/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.Lentokoneet;

/**
 *
 * @author rontt
 */

public class lentokohteet {
    private String kohde;
    
    public lentokohteet(String kohde) {
        this.kohde = kohde;
    }
    
    @Override
    public String toString() {
        return this.kohde;
    }
}
