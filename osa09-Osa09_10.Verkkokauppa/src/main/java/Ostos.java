
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class Ostos {
    private String tuote;
    private int kpl;
    private int yksikkohinta;
    
    public Ostos(String tuote, int kpl, int yksikkohinta) {
        this.tuote = tuote;
        this.kpl = kpl;
        this.yksikkohinta = yksikkohinta;
    }
    
    public int hinta() {
        return this.yksikkohinta * this.kpl;
    }
    
    public void kasvataMaaraa() {
        this.kpl += 1;
    }

    
    @Override
    public String toString() {
        return this.tuote + ": " + this.kpl;
    }
}
