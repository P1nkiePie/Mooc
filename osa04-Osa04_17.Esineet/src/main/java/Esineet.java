
import java.util.ArrayList;
import java.util.Scanner;

public class Esineet {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Esine: ");
            String syote = lukija.nextLine();
            if (syote.isEmpty()) {
                break;
            }
            esineet.add(new Esine(syote));
        }
        System.out.println(esineet.toString());
    }
}
