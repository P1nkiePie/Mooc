
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        
        try (Scanner txtlukija = new Scanner(Paths.get(tiedosto))) {
            while (txtlukija.hasNextLine()) {
                String luettava = txtlukija.nextLine();
                String[] palat = luettava.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);
                
                if (ika == 1) {
                    System.out.println(nimi + " ikä: " + ika + " vuosi");
                    continue;
                }
                System.out.println(nimi + " ikä: " + ika + " vuotta");
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }
}
