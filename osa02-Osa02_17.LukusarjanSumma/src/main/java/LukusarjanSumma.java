
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int i = 0;
        int summa = 0;
        
        System.out.println("Mihin asti?");
        int max = Integer.valueOf(lukija.nextLine());
        
        while (i <= max) {
            summa = summa + i;
            i++;        
        }
        System.out.println("Summa on " + summa);
    }
}
