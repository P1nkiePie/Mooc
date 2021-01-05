
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int ensimmainen = 0;
        int toinen = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen + "/100");
            System.out.println("Toinen: " + toinen + "/100");
            System.out.print("> ");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            
            if (luettu.contains("lisaa")) {
                String[] palat = luettu.split(" ");
                int lisattava = Integer.valueOf(palat[1]);
                if (lisattava < 0) continue;
                ensimmainen += lisattava;
                if (ensimmainen >= 100) {
                    ensimmainen = 100;
                }
            }    
            
            if (luettu.contains("siirra")) {
               String[] palat = luettu.split(" ");
               int siirrettava = Integer.valueOf(palat[1]);              
               
            if (siirrettava < 0) continue;
                if (siirrettava > ensimmainen) {
                    toinen = toinen + ensimmainen;
                    ensimmainen = 0;
                    if (toinen > 100) toinen = 100;
                    continue;
                }else {
                    toinen = toinen + siirrettava;
                    if (toinen > 100) toinen = 100;
                    ensimmainen = ensimmainen - siirrettava;
                    continue;
                }
               
            }
            
            if (luettu.contains("poista")) {
                String[] palat = luettu.split(" ");
                int poistettava = Integer.valueOf(palat[1]);
                if (poistettava < 0) continue;
                toinen -= poistettava;
            }
            if (toinen < 0) {
                toinen = 0;
            }
        }
    }
}
