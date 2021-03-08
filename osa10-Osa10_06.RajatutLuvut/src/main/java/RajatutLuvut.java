
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while(true) {
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote < 0) break;
            lista.add(syote);
        }
        lista.stream()
                .filter(luku -> luku >= 1 && luku <=5)
                .forEach(luku -> System.out.println(luku));
    }
}
