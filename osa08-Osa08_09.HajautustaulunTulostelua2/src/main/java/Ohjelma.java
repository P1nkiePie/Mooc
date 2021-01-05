
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        HashMap<String, Kirja> taulu = new HashMap<>();
        taulu.put("tunteet", new Kirja("Järki ja tunteet", 1811, "..."));
        taulu.put("luulot", new Kirja("Ylpeys ja ennakkoluulo", 1813, "..."));
        
        tulostaArvot(taulu);
        tulostaArvoJosNimessa(taulu, "tun");
    }
    
    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        for (Kirja kirjat: hajautustaulu.values()) {
            System.out.println(kirjat);
        }
        System.out.println("---");
    }
    
    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono) {
        for (Kirja kirjat: hajautustaulu.values()) {
            if (kirjat.getNimi().contains(merkkijono)) {
                System.out.println(kirjat);
            }
        }
    }
}
