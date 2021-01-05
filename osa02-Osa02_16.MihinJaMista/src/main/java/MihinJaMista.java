
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti?");
        int max = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien?");
        int min = Integer.valueOf(lukija.nextLine());
        
        while (min <= max) {
            System.out.println(min);
            min++;
        }
        
    }
}
