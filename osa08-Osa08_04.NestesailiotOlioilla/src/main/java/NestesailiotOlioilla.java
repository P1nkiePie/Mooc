
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Sailio ensimmainen = new Sailio();
        Sailio toinen = new Sailio();
        
        while (true) {
            System.out.println("Ensimmainen: " + ensimmainen);
            System.out.println("Toinen: " + toinen);
            System.out.print("> ");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String[] palat = luettu.split(" ");            
            int luku = Integer.valueOf(palat[1]);
            
            if (luettu.contains("lisaa")) {
                ensimmainen.lisaa(luku);
            }
            if (luettu.contains("poista")) {
                if (luku>toinen.sisalto()) luku=toinen.sisalto();
                toinen.poista(luku);
            }
            if (luettu.contains("siirra")) {
                if (luku>ensimmainen.sisalto()) luku=ensimmainen.sisalto();
                ensimmainen.poista(luku);
                toinen.lisaa(luku);
                continue;
            }
        }
    }
}
