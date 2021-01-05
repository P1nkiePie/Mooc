
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        
        System.out.println("Ensimmäinen:");
        int min = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");
        int max = Integer.valueOf(lukija.nextLine());
        
        while (min <= max) {
            summa = summa + min;
            min++;
        }
        System.out.println("Summa on " + summa);
    }
}
