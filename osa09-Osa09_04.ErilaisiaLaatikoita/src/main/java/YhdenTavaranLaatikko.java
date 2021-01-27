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

public class YhdenTavaranLaatikko extends Laatikko {
        private ArrayList lista;
                
    public YhdenTavaranLaatikko() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.lista.isEmpty()) {
            this.lista.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (int i=0; i<this.lista.size(); i++) {
            if (tavara.equals(this.lista.get(i))) return true;
        }
        return false;
    }
    
}
