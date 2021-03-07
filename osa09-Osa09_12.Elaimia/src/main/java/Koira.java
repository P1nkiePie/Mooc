/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class Koira extends Elain implements Aanteleva{

    
    public Koira(String nimi) {
        super(nimi);
    }
    
    public Koira() {
        super("Koira");
    }
    
    public void hauku() {
        System.out.println(this.getNimi() + " haukkuu");
    }
    
    @Override
    public void aantele() {
        hauku();
    }
}
