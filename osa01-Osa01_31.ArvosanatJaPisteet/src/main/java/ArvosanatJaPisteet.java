
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet [0-100]: ");
        int syote = Integer.valueOf(lukija.nextLine());
        
        if (syote < 0) {
            System.out.println("Mahdotonta!");
        } else if (syote >= 0 && syote <= 49) {
            System.out.println("Arvosana: hylätty");
        } else if (syote >= 50 && syote <= 59) {
            System.out.println("Arvosana: 1");
        } else if (syote >= 60 && syote <= 69) {
            System.out.println("Arvosana: 2");
        } else if (syote >= 70 && syote <= 79) {
            System.out.println("Arvosana: 3");
        } else if (syote >= 80 && syote <= 89) {
            System.out.println("Arvosana: 4");
        } else if (syote >= 90 && syote <= 100) {
            System.out.println("Arvosana: 5");
        } else if (syote > 100) {
            System.out.println("Arvosana: uskomatonta!");
        }

    }
}
