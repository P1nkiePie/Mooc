
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio eka = new Sailio();
        Sailio toka = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + eka.toString());
            System.out.println("Toinen: " + toka.toString());
            
            System.out.print("> ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                break;
            } if (komento.contains("lisaa")) {
                String[] palat = komento.split(" ");
                int maara = Integer.valueOf(palat[1]);
                if (maara < 0) {
                    continue;
                }
                eka.lisaa(maara);
            } else if (komento.contains("siirra")) {
                String[] palat = komento.split(" ");
                int maara = Integer.valueOf(palat[1]);
                if (maara > eka.sisalto()) {
                    toka.lisaa(eka.sisalto());
                    eka.poista(eka.sisalto());
                    continue;
                }
                eka.poista(maara);
                toka.lisaa(maara);
                } else if (komento.contains("poista")) {
                    String[] palat = komento.split(" ");
                    int maara = Integer.valueOf(palat[1]);
                    toka.poista(maara);
            }            
        }
    }
}
