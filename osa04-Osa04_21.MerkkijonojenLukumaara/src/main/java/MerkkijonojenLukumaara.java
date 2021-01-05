
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int maara = 0;
        
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")) {
                break;
            }
            maara++;
        }
        System.out.println(maara);

    }
}
