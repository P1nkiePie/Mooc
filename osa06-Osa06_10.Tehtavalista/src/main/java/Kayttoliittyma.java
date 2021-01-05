/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */

import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    private Tehtavalista tehtava;
    
    public Kayttoliittyma(Tehtavalista tehtava,  Scanner lukija) {
        this.lukija = lukija;
        this.tehtava = tehtava;
    }
    
    public void kaynnista() {
        
        while (true) {
            System.out.println("Komento:");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                break;
            }
            if (komento.equals("lisaa")) {
                System.out.println("Lisättävä:");
                String lisattava = lukija.nextLine();
                tehtava.lisaa(lisattava);
                
            }
            if (komento.equals("poista")) {
                System.out.println("Poistettava:");
                int poistettava = Integer.valueOf(lukija.nextLine());
                tehtava.poista(poistettava);
            }
            if (komento.equals("listaa")) {
                tehtava.tulosta();
            }
        }
    }
}
