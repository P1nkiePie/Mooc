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

public class MaksimipainollinenLaatikko extends Laatikko{
    private int maxpaino;
    
    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maxpaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }
    
    public int sisaltopaino() {
        int sisaltopaino = 0;
        for (int i=0; i<this.tavarat.size(); i++) {
            sisaltopaino = sisaltopaino + this.tavarat.get(i).getPaino();
        }
        return sisaltopaino;
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (!(tavara.getPaino()+sisaltopaino()>this.maxpaino)) {
            tavarat.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (int i=0; i<this.tavarat.size(); i++) {
            if (tavara.equals(tavarat.get(i))) return true;
        }
        return false;
    }
}
