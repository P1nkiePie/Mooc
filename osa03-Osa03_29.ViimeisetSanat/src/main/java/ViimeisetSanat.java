
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String syote = lukija.nextLine();
            if (syote.isEmpty()) {
                break;
            }
            String[] palat = syote.split(" ");
            for (int i=0; i<palat.length; i++) {
                if (i==palat.length-1) {
                    System.out.println(palat[i]);                
                }
            }    
        }

    }
}
