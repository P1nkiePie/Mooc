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

public class HukkaavaLaatikko extends Laatikko{
        private ArrayList lista;
        
    public HukkaavaLaatikko() {
        this.lista=new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        this.lista.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
    
}
