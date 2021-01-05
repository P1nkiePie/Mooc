
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int maara = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if(luku == 0) {
                break;
            } else {
                maara++;
                summa = summa + luku;
                continue;
            }
        }
        System.out.println("Lukujen keskiarvo " + (1.0*summa/maara));
    }
}
