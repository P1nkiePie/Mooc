
import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä merkkijono!");
        String syote = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int kluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double lluku = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean arvo = Boolean.valueOf(lukija.nextLine());
        
        System.out.println("Syötit merkkijonon " + syote);
        System.out.println("Syötit kokonaisluvun " + kluku);
        System.out.println("Syötit liukuluvun " + lluku);
        System.out.println("Syötit totuusarvon " + arvo);

    }
}
