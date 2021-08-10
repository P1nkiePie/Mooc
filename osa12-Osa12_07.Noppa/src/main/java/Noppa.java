
import java.util.Random;

public class Noppa {

    private Random random;
    private int tahkojenMaara;

    public Noppa(int tahkojenMaara) {
        this.random = new Random();
        this.tahkojenMaara=tahkojenMaara;
    }

    public int heita() {
        return new Random().nextInt(tahkojenMaara)+1;
    }
}
