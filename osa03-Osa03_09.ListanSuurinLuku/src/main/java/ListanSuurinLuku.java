
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        
        System.out.println("");

        int suurin = 0;
        
        for (int i=0; i<lista.size(); i++) {
            int luku = lista.get(i);
            if (luku>suurin) {
                suurin=luku;
            }
        }
        System.out.println(suurin);
    }
}
