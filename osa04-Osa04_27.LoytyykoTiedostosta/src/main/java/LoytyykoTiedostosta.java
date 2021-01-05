import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList <String> lista = new ArrayList<>();
        
        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        
        try(Scanner txtlukija = new Scanner(Paths.get(tiedosto))) {
            while (txtlukija.hasNextLine()) {
                lista.add(txtlukija.nextLine());
            }          
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui!");
        }
        for (String nimi: lista) {
            if (lista.contains(etsittava)) {
                System.out.println("Löytyi!");
            } else {
                System.out.println("Ei löytynyt!");
            }
        }

    }
}
