
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int i = 1;
        
        System.out.println("Anna luku:");
        int luku = Integer.valueOf(lukija.nextLine());
        
        while (luku > 0) {
            i = i * luku;
            luku--;
        }
        System.out.println(i);
    }
}
