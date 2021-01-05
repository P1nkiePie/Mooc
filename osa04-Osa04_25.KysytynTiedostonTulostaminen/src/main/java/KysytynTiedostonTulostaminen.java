
import java.nio.file.Paths;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String syote = lukija.nextLine();
        
        try (Scanner txtlukija = new Scanner(Paths.get(syote))) {
            while (txtlukija.hasNextLine()) {
                System.out.println(txtlukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }
}
