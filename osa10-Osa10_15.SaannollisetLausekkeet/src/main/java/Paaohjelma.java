import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Tarkistin tarkistin = new Tarkistin();
        
        System.out.println("Anna merkkijono:");
        String syote = lukija.nextLine();
        if (tarkistin.onViikonpaiva(syote)==true) System.out.println("Muoto on oikea.");
        else System.out.println("Muoto ei ole oikea.");
        
        System.out.println("Anna merkkijono:");
        syote = lukija.nextLine();
        if (tarkistin.kaikkiVokaaleja(syote)==true) System.out.println("Muoto on oikea.");
        else System.out.println("Muoto ei ole oikea.");
        
        System.out.println("Anna merkkijono:");
        syote = lukija.nextLine();
        if (tarkistin.kellonaika(syote)==true) System.out.println("Muoto on oikea");
        else System.out.println("Muoto ei ole oikea");
        
    }
}
