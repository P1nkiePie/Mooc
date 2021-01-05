
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Etunimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.println("Sukunimi: ");
            String sukunimi = lukija.nextLine();
            System.out.println("Henkilötunnus: ");
            String henkilotunnus = lukija.nextLine();
            
            henkilotiedot.add(new Henkilotieto(nimi, sukunimi, henkilotunnus));
        }
        String tulostettava = henkilotiedot.toString();
        String[] palat = tulostettava.split(",| ");
        String sukunimet = palat[0];
        String nimi = palat[1];
        int hetu = Integer.valueOf(palat[2]);
        for (int i=0; i<palat.length-1; i++) {
            System.out.println(sukunimet + nimi);
        }            
    }
}
