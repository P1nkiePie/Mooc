
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto parilSumma = new Lukutilasto();
        Lukutilasto paritSumma = new Lukutilasto();
        
        System.out.println("Anna lukuja: ");
        
        int parilliset = 0;
        int parittomat = 0;
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            tilasto.lisaaLuku(luku);
            
            if (luku % 2 == 0) {
                parilSumma.lisaaLuku(luku);
            }
            if (luku % 2 != 0) {
                paritSumma.lisaaLuku(luku);
            }
        }
        System.out.println("Määrä: " + tilasto.haeLukujenMaara());
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten summa: " + parilSumma.summa());
        System.out.println("Parittomien summa: " + paritSumma.summa());
        System.out.println("Keskiarvo: " + tilasto.keskiarvo());
    }
}
