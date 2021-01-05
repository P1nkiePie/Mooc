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
import java.util.Random;

public class Vitsipankki {
    
    private ArrayList<String> vitsit;
    
    public Vitsipankki() {
        this.vitsit = new ArrayList<>();
    }
    
    public void lisaaVitsi(String vitsi) {
        vitsit.add(vitsi);
    }
    
    public String arvoVitsi() {
        if (this.vitsit.isEmpty()) {
            return "Vitsit vähissä.";
        } 
        Random arpa = new Random();
        int i = arpa.nextInt(vitsit.size());
        return vitsit.get(i);
    }
    
    public void tulostaVitsit() {
        for (String vitsi: this.vitsit) {
            System.out.println(vitsi);
        }
    }
    
}
