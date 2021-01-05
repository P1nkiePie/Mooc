import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Maksukortti Pekankortti = new Maksukortti(20);
        Maksukortti Matinkortti = new Maksukortti(30);
        
                
        Pekankortti.syoMaukkaasti();
        Matinkortti.syoEdullisesti();
        System.out.println("Pekka: " + Pekankortti.toString());
        System.out.println("Matti: " + Matinkortti.toString());
        Pekankortti.lataaRahaa(20);
        Matinkortti.syoMaukkaasti();
        System.out.println("Pekka: " + Pekankortti.toString());
        System.out.println("Matti: " + Matinkortti.toString());
        Pekankortti.syoEdullisesti();
        Pekankortti.syoEdullisesti();
        Matinkortti.lataaRahaa(50);
        System.out.println("Pekka: " + Pekankortti.toString());
        System.out.println("Matti: " + Matinkortti.toString());

    }
}
