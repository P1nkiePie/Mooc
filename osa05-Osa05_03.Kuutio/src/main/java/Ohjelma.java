
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Kuutio k = new Kuutio(7);
        
        System.out.println(k.tilavuus());
        System.out.println(k.toString());
        
        Kuutio suola = new Kuutio(8);
        
        System.out.println(suola.tilavuus());
        System.out.println(suola);
    }
}
