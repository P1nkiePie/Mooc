package mooc;
import mooc.logiikka.Sovelluslogiikka;
import mooc.ui.Tekstikayttoliittyma;
import mooc.ui.Kayttoliittyma;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello packages!");   
        Kayttoliittyma kayttoliittyma = new Tekstikayttoliittyma();
        new Sovelluslogiikka(kayttoliittyma).suorita(5);
    }
}
