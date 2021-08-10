
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        while (this.numerot.size()<7) {
            Random r = new Random();
            int luku = r.nextInt(41-1)+1;
            if (this.sisaltaaNumeron(luku))continue;
            else this.numerot.add(luku);
        }
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        return this.numerot.contains(numero);
    }
}
