
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String sana = "totta";
        System.out.println("Kirjoita merkkijono:");
        String syote = lukija.nextLine();
        
        if (syote.equals(sana)) {
            System.out.println("Oikein meni!");
        } else {
            System.out.println("Koitappa uudelleen!");
        }
        
    }
}
