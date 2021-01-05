
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        this.rahaa = 1000;  // kassassa on aluksi 1000 euroa rahaa
    }
    
    public boolean syoEdullisesti(Maksukortti kortti) {
        double lounas = 2.50;
        if (kortti.saldo() >= lounas) {
            kortti.otaRahaa(lounas);
            this.edulliset++;
            return true;
        }
        return false;
    }
    
    public boolean syoMaukkaasti(Maksukortti kortti) {
        double lounas = 4.30;
        if (kortti.saldo() >= lounas) {
            kortti.otaRahaa(lounas);
            this.maukkaat++;
            return true;
        }   
        return false;
    }

    public double syoEdullisesti(double maksu) {
        double lounas = 2.50;  // edullinen lounas maksaa 2.50 euroa.
        this.rahaa = this.rahaa + lounas;  // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        if (maksu < 2.5) {  // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
            this.rahaa = this.rahaa - lounas;
            return maksu;
        }
        this.edulliset++;
        return maksu - lounas;
    }

    public double syoMaukkaasti(double maksu) {
        double lounas = 4.30; // maukas lounas maksaa 4.30 euroa.
        this.rahaa = this.rahaa + lounas;  // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        if (maksu < 2.5) {  // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
            this.rahaa = this.rahaa - lounas;
            return maksu;  
        }
        this.maukkaat++;
        return maksu - lounas;
    }
    
    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa >= 0) {
            kortti.lataaRahaa(summa);
            this.rahaa = this.rahaa+summa;
        }
    }


    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
