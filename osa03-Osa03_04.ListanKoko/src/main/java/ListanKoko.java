
import java.util.ArrayList;
import java.util.Scanner;

public class ListanKoko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<>();
        int i=lista.size();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            i++;
            lista.add(luettu);
        }
        System.out.println(i);
    }
}
