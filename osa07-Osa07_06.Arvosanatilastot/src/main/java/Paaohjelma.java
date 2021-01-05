import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Pisteet pisteet = new Pisteet();
        Pisteet hyvaksytyt = new Pisteet();
        
        System.out.println("Syotä yhteispisteet, -1 lopettaa");        
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());
            
            if (syote == -1) {
                break;
            }
            if (syote >= 0 && (syote <= 100)) {
                pisteet.Lisaa(syote);
            }
            if (syote >=50 && (syote <= 100)) {
                hyvaksytyt.Lisaa(syote);
            }
        }
        System.out.println("Pisteiden keskiarvo (kaikki): " + pisteet.keskiarvo());
        System.out.println("Pisteiden keskiarvo (hyväksytyt): " + hyvaksytyt.keskiarvo());
        System.out.println("Hyväksymisprosentti: " + hyvaksytyt.hyvaksyttyProsenttiosuus(pisteet));
        pisteet.tulostaTahtia();
    }
}
