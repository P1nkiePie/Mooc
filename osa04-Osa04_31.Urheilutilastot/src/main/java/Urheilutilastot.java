
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Tilasto> joukkue = new ArrayList<>();
        
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();   
        
        try(Scanner tiedostoLukija = new Scanner (Paths.get(tiedosto))) {
            while (tiedostoLukija.hasNextLine()) {
                String luettava = tiedostoLukija.nextLine();
                String[] palat = luettava.split(",");
                String joukkue1 = palat[0];
                String joukkue2 = palat[1];
                int pisteet1 = Integer.valueOf(palat[1]);
                int pisteet2 = Integer.valueOf(palat[3]);
                
                joukkue.add(new Tilasto (joukkue1, pisteet1));
                joukkue.add(new Tilasto(joukkue2, pisteet2));             
            }         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String Joukkue = lukija.nextLine();
        
        for (Tilasto tulostettava: joukkue) {
            if (tulostettava.equals(Joukkue)) {
                System.out.println(tulostettava);
            }
        }    
    }
}
