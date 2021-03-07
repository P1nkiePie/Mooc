/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
import java.util.ArrayList;

public class Lauma implements Siirrettava{
    private ArrayList<Siirrettava> lauma;
    
    public Lauma() {
        this.lauma = new ArrayList<>();
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.lauma.add(siirrettava);
    }
    
    @Override
    public String toString() {
        String tulostus = "";
        for (Siirrettava eliot: this.lauma) {
            tulostus += eliot + "\n"; 
        }
        return tulostus;
    }
    
    public void siirra(int dx, int dy) {
        for (Siirrettava elio: this.lauma) {
            elio.siirra(dx, dy);
        }
    }
    
}
