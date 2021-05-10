package lentokentta;
import java.util.*;
import lentokentta.Kayttoliittyma.Kayttoliittyma;
import lentokentta.Lentokoneet.Koneet;
import lentokentta.Lentokoneet.Lento;
import lentokentta.kayttoHallinta.Hallinta;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Hallinta hallinta = new Hallinta();
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(hallinta, lukija);
        kayttoliittyma.kaynnista();
    }
}
