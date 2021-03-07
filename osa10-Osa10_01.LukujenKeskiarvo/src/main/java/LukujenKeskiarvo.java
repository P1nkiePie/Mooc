
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne

    ArrayList<String> lista = new ArrayList<>();
    System.out.println("Kirjoita syötteitä, loppu lopettaa");
    while (true) {
        String syote = lukija.nextLine();
        if (syote.equals("loppu")) break;
        lista.add(syote);
    }
    long lukumaara = lista.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(luku -> luku >0)
        .count();
        
    double keskiarvo = lista.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();
    
    System.out.println("Lukujen keskiarvo: " + keskiarvo);
    }
}
