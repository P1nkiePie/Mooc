
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        ArrayList<Henkilo> henkilot = lueHenkilot(tiedosto);
        System.out.println("Henkilöitä: " + henkilot.size());
        System.out.println("Henkilöt:");
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);

        }
    }

    public static ArrayList<Henkilo> lueHenkilot(String tiedosto) {
        ArrayList<Henkilo> henkilot = new ArrayList<>();
        
        try (Scanner txtlukija = new Scanner(Paths.get(tiedosto))) {
            while (txtlukija.hasNextLine()) {
                String luettava = txtlukija.nextLine();
                String[] palat = luettava.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);
                henkilot.add(new Henkilo(nimi, ika));
            }
        } catch (Exception e) {
          System.out.println("Virhe: " + e.getMessage());  
        } 

        
        return henkilot;

    }
}
