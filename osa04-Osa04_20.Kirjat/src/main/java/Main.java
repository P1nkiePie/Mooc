
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList <Kirja> kirjat = new ArrayList<>();
        
        while (true) {
        System.out.println("Nimi:");
        String nimi = lukija.nextLine();
        if (nimi.isEmpty()) {
            break;
        }
        System.out.println("Sivuja");
        int sivut = Integer.valueOf(lukija.nextLine());
        System.out.println("Julkaisuvuosi:");
        int vuosi = Integer.valueOf(lukija.nextLine());
        
        kirjat.add(new Kirja (nimi, sivut, vuosi));
        
        }
        
        System.out.println("Mitä tulostetaan?");
        String syote = lukija.nextLine();
        
        if (syote.equals("kaikki")) {
            for (Kirja kaikki: kirjat) {
                System.out.println(kaikki.toString());
            }
        } else if (syote.equals("nimi")){
            for (Kirja nimet: kirjat) {
                System.out.println(nimet.nimi());
            }
        }
        
        
    }
}
