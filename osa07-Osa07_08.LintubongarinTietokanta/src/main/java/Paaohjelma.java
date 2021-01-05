import java.util.Scanner;
import java.util.ArrayList;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        ArrayList<Linnut> linnut = new ArrayList<>();
        
        System.out.println("Lisaa - lisää linnun\n"
                + "Havainto - lisää havainnon\n"
                + "Tilasto - tulostaa kaikki linnut\n"
                + "Nayta - tulostaa yhden linnun\n"
                + "Lopeta - lopettaa ohjelman\n");
        
        while (true) {
            System.out.println("Anna komento:");
            String komento = lukija.nextLine();
            
            if (komento.equals("Lopeta")) {
                break;
            }
            if (komento.equals("Lisaa")) {
                System.out.println("Nimi");
                String nimi = lukija.nextLine();
                System.out.println("Latinankielinen nimi");
                String latinanimi = lukija.nextLine();
                Linnut lisattava = new Linnut(nimi, latinanimi);
                linnut.add(lisattava);
                continue;
            }
            if (komento.equals("Havainto")) {
                System.out.println("Mikä havaittu?");
                String havaittu = lukija.nextLine();
                for (Linnut lintu: linnut) {
                    if (lintu.getnimi().equals(havaittu)) {
                        lintu.havainto();
                    }
                }
            }
            if (komento.equals("Nayta")) {
                System.out.println("Mikä?");
                String haettava = lukija.nextLine();
                for (Linnut lintu: linnut) {
                    if (lintu.getnimi().equals(haettava)) {
                        System.out.println(lintu);
                    }
                }
            }
            if (komento.equals("Tilasto")) {
                for (Linnut lintu: linnut) {
                    System.out.println(lintu);
                }
            }
        }

    }

}
