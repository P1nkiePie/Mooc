
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println("Kirjoita syotteitä, loppu lopettaa");
        while(true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")) break;
            lista.add(syote);
        }
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo?");
        System.out.println("n/p");
        String syote = lukija.nextLine();
        if (syote.equals("n")) {
            double keskiarvo = lista.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> luku <= 0)
                    .average()
                    .getAsDouble();
            System.out.println("Negatiivisten lukujen keskiarvo: " + keskiarvo);
        } else if (syote.equals("p")){
            double keskiarvo = lista.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> luku >= 0)
                    .average()
                    .getAsDouble();
            System.out.println("Positiivisten lukujen keskiarvo: " + keskiarvo);
        }

    }
}
