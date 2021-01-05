
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList <Integer> lista = new ArrayList <>();
        
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote==-1) {
                break;
            }
            lista.add(syote);
        }
        int maara = 0;
        int summa=0;
        for (int i=0; i<lista.size(); i++) {
            maara++;
            summa+=lista.get(i);
        }
        System.out.println("Keskiarvo: " + 1.0*summa/maara);
    }
}
