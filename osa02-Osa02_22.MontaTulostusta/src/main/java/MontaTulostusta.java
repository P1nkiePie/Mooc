
import java.util.Scanner;

public class MontaTulostusta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kuinka monta?");
        int luku = Integer.valueOf(lukija.nextLine());
        
        int i = 1;
        
        while (i <= luku) {
            tulostaTeksti();
            i++;
        } 
        
    }

    public static void tulostaTeksti() {

        System.out.println("Alussa olivat suo, kuokka ja Java.");
    }
}
