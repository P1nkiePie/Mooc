
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
         ArrayList<Varasto> varastot = new ArrayList<>();

        while (true) {
            System.out.println("Syotä esineen tunnus, tyhjä lopettaa.");
            String tunnus = lukija.nextLine();
            if (tunnus.isEmpty()) {
                break;
            }
        
            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            
            Varasto tuote = new Varasto(tunnus, nimi);
            
            if (nimi.isEmpty()) {
                break;                
            }
            
            if (varastot.contains(tuote)) {
                continue;
            }
      
            varastot.add(tuote);
        }
        for (int i=0; i<varastot.size(); i++) {
            System.out.println(varastot.get(i));
        }
    }
}
