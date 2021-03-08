
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<>();
        while(true) {
            String syote = lukija.nextLine();
            if (syote.isEmpty()) break;
            lista.add(syote);
        }
        lista.stream().forEach(luettu -> System.out.println(luettu));
    }
}
