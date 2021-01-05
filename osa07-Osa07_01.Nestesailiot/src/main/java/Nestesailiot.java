
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int eka = 0;
        int toka = 0;
        
        while (true) {
            System.out.println("Ensimmäinen: " + eka + "/100");
            System.out.println("Toinen: " + toka + "/100");
            System.out.print("> ");
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            } if (luettu.contains("lisaa")) {
                String[] osat = luettu.split(" ");
                String komento = osat[0];
                int maara = Integer.valueOf(osat[1]);
                if (maara < 0) {
                    continue;
                }
                eka = eka + maara;
                if (eka > 100) {
                    eka = 100;
                }
            } if (luettu.contains("siirra")) {
                String[] osat = luettu.split(" ");
                String komento = osat[0];
                int maara = Integer.valueOf(osat[1]);
                
                if (maara < 0||eka == 0) {
                    continue;
                }
                if (maara > eka) {
                    toka = toka + eka;
                    eka = 0;
                    continue;
                } else {
                    toka = toka + maara;
                    eka = eka - maara;
                }
                if (eka > 100) {
                    eka = 100;
                } if (toka > 100) {
                    toka = 100;
                }              
            } if (luettu.contains("poista")) {
                String[] osat = luettu.split(" ");
                String komento = osat[0];
                int maara = Integer.valueOf(osat[1]);
                toka = toka - maara;
                if (toka < 0) {
                    toka = 0;
                } 
            }
        }   
    }
}
