
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Mittari mitta = new Mittari();
        
        while (!mitta.taynna()) {
            System.out.println("Ei täynnä! Mitta: " + mitta.mitta());
        }
        System.out.println("Täynnä! Mitaa: " + mitta.mitta());
        mitta.vahenna();
        System.out.println("Ei täynnä! Mitta: " + mitta.mitta());
        
    }
}
