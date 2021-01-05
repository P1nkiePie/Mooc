
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mitä tulostetaan?");
        String syote = lukija.nextLine();
        
        for (int i=0; i<3; i++) {
            System.out.print(syote);
        }
        System.out.println("");
    }
}
