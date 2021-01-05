
import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        int maara = 0;
        try (Scanner tlukija = new Scanner(Paths.get(tiedosto))) {
            while (tlukija.hasNextInt()) {
                int luku = tlukija.nextInt();
                if (luku >= alaraja && (luku <= ylaraja)) {
                    maara++;
                }
            }
            
        } catch (Exception e) {
                System.out.println("Virhe: " + e.getMessage());
                }
        System.out.println("Lukuja: " + maara);
    }

}
