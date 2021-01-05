
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int maara = 0;
        String pisin = "";
        while (true) {
            String syote = lukija.nextLine();
            if (syote.isEmpty()) {
                break;
            }
            String[] palat = syote.split(",");
            int luku = Integer.valueOf(palat[1]);
            maara++;
            summa+=luku;
            
            if (palat[0].length()>pisin.length()) {
                    pisin = palat[0];
            }
        }
        System.out.println("Pisin nimi: " + pisin + "\n" + "Syntymävuosien keskiarvo: " + 1.0*summa/maara);
    }
}
