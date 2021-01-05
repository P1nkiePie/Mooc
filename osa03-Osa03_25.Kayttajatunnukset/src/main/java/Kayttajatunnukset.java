
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String nimi1 = "aleksi";
        String salasana1 = "tappara";
        String nimi2 = "elina";
        String salasana2 = "kissa";
        
            System.out.println("Anna tunnus:");
            String syote = lukija.nextLine();
            System.out.println("Anna salasana:");
            String syote1 = lukija.nextLine();
            
            if (syote.equals(nimi1)&&(syote1.equals(salasana1))) {
                System.out.println("Olet kirjautunut järjestelmään");
            } else if (syote.equals(nimi2)&&(syote1.equals(salasana2))) {
                System.out.println("Olet kirjautunut järjestelmään");
            } else {
                System.out.println("Virheellinen tunnus tai salasana!");
            }       

    }
}
