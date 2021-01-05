
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int maara = 0;
        int parilliset = 0;
        int parittomat = 0;
        
        System.out.println("Syötä luvut:");
        
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());
            
            if (syote == -1) {
                System.out.println("Kiitos ja näkemiin!");
                break;
            } else {
                summa += syote;
                maara++;
            }             
            if (syote % 2 == 0) {
                parilliset++;
            } else {
                parittomat++;
            }
        }
        System.out.println("Summa: " + summa + "\n" + "Lukuja: " + maara);
        System.out.println("Keskiarvo: " + (1.0*summa/maara));
        System.out.println("Parillisia: " + parilliset + "\n" + "Parittomia: " + parittomat);
    }
}
