/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class MuistavaTuotevarasto extends Tuotevarasto{
    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.muutoshistoria = new Muutoshistoria();
        muutoshistoria.lisaa(alkuSaldo);
    }
    
    public String historia() {
        return this.muutoshistoria.toString();
    }
    
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        this.muutoshistoria.lisaa(super.getSaldo());
    }
    
    public double otaVarastosta(double maara) {
        double vahennettava = super.otaVarastosta(maara);
        this.muutoshistoria.lisaa(super.getSaldo());
        return vahennettava;
    }
    
    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + this.getNimi() + "\n" + "Historia: " + this.historia() + "\n"
                + "Suurin tuotemäärä: " + this.muutoshistoria.maxArvo() + "\n"
                + "Pienin tuotemäärä: " + this.muutoshistoria.minArvo() + "\n"
                + "Keskiarvo: " + this.muutoshistoria.keskiarvo());                
    }
}
