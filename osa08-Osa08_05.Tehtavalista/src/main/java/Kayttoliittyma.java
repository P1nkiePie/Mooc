import java.util.Scanner;
import java.util.ArrayList;

public class Kayttoliittyma {
    private Scanner lukija;
    private Tehtavalista lista;
    
    public Kayttoliittyma(Tehtavalista lista, Scanner lukija) {
        this.lista = lista;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.println("Komento:");
            String komento = lukija.nextLine();
            
            if (komento.endsWith("lopeta")) break;
            
            if (komento.equals("lisaa")) {
                System.out.println("Lisättävä:");
                String lisattava = lukija.nextLine();
                lista.lisaa(lisattava);
            }
            
            if (komento.equals("listaa")) lista.tulosta();
            
            if (komento.equals("poista")) {
                System.out.println("Mikä poistetaan?");
                int poistettava = Integer.valueOf(lukija.nextLine());
                lista.poista(poistettava);
            }
        }
    }
}
