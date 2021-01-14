/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class Tuotevarasto extends Varasto {
    private String tuottenNimi;
    
    public Tuotevarasto(String tuotenimi, double tilavuus) {
        super(tilavuus);
        this.tuottenNimi = tuotenimi;
    }
    
    public String getNimi() {
        return this.tuottenNimi;
    }
    
    public void setNimi(String uusiNimi) {
        this.tuottenNimi = uusiNimi;
    }
    
    @Override
    public String toString() {
        return this.tuottenNimi + ": " + "saldo = " + this.getSaldo() + ", tilaa " + this.paljonkoMahtuu();
    }
    
}
