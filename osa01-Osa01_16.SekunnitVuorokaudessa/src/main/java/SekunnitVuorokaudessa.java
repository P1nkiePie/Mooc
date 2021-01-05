
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int syote = Integer.valueOf(lukija.nextLine());
        
        int sekuntilasku = 86400 * syote;
        
        System.out.println(sekuntilasku);

    }
}
