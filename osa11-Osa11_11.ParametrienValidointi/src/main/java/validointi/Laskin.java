package validointi;

public class Laskin {

    public int kertoma(int luvusta) {
        int kertoma = 1;
        if (luvusta >= 0) {
            for (int i = 1; i <= luvusta; i++) {
                kertoma *= i;
            } 
        } else {
            throw new IllegalArgumentException("Virhe!");
        }
        return kertoma;
    }

    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {
        if (joukonKoko < 0 && osaJoukonKoko > joukonKoko) {
            throw new IllegalArgumentException("Virhe!");
        }
        int osoittaja = kertoma(joukonKoko);
        int nimittaja = kertoma(osaJoukonKoko) * kertoma(joukonKoko - osaJoukonKoko);       
        return osoittaja / nimittaja;
    }
}
