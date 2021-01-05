
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Tehtavalista lista = new Tehtavalista();
        Scanner lukija = new Scanner(System.in);
        
        Tehtavalista tehtavalista = new Tehtavalista();
        Kayttoliittyma liittyma = new Kayttoliittyma(lista, lukija);
        
        liittyma.kaynnista();
        lista.tulosta();
        
    }
}
