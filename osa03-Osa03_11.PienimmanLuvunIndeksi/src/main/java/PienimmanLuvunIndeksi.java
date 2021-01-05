
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
        ArrayList <Integer> lista = new ArrayList <>();
         
        System.out.println("Anna lukuja:");
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote == 9999) {
                break;
            }
            lista.add(syote);
        }
        int indeksi = 0;
        int pienin = 9999;        
        for (int i=0; i<lista.size(); i++) {
            int luku = lista.get(i);
            if (luku<pienin) {
                pienin=luku;
                indeksi=i;
            }
        }
        System.out.println("Pienin luku on " + pienin);
        System.out.println("Pienin luku löytyy indeksistä " + indeksi);
    }
}
