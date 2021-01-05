import java.util.Scanner;
import java.util.ArrayList;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanat;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanat = sanakirja;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.println("Komento:");
            String komento = lukija.nextLine();
            
            if (komento.equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
            
            } else if (komento.equals("lisaa")) {
                System.out.println("Sana:");                
                String sana = lukija.nextLine();                
                System.out.println("Käännös:");
                String kaannos = lukija.nextLine();                
                this.sanat.lisaa(sana, kaannos);
                                
            } else if (komento.equals("hae")) {
                System.out.println("Haettava:");
                String haettava = lukija.nextLine();
                
                if (sanat.kaanna(haettava)==null) {
                    System.out.println("Sanaa " + haettava + " ei löydy");
                
                } else {
                    System.out.println("Käännös: " + sanat.kaanna(haettava));
                continue; 
                
                }           
            } 
                System.out.println("Tuntematon komento");
        }
    }
}  

