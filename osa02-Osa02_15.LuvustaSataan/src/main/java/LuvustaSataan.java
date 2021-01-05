
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int i = Integer.valueOf(lukija.nextLine());
        
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

    }
}
