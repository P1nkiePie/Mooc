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
public class Lento {
    private Koneet kone;
    private lentokohteet lahtoPaikka;
    private lentokohteet kohdePaikka;
    
    public Lento(Koneet kone, lentokohteet lahto, lentokohteet kohde) {
        this.kone = kone;
        this.lahtoPaikka = lahto;
        this.kohdePaikka = kohde;
    }

    public Lento(String tunnus, String lahto, String kohde) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Koneet get_Lentokone() {
        return this.kone;
    }
    
    public lentokohteet get_LahtoPaikka() {
        return this.lahtoPaikka;
    }
    
    public lentokohteet get_KohdePaikka() {
        return this.kohdePaikka;
    }
    
    @Override
    public String toString() {
        return this.kone.toString() + " (" + this.lahtoPaikka.toString() + "-" + this.kohdePaikka.toString() + ")";
    }
}
