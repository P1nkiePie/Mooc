
public class Maksukortti {

    private double saldo;

    public Maksukortti(double saldo) {
        this.saldo = saldo;
    }

    public double saldo() {
        return this.saldo;
    }

    public void lataaRahaa(double lisays) {
        this.saldo += lisays;
    }

    public boolean otaRahaa(double maara) {
        // toteuta metodi siten että se ottaa kortilta rahaa vain jos saldo on vähintään maara
        // onnistuessaan metodi palauttaa true ja muuten false
        boolean onnistuiko = true;
        this.saldo = this.saldo - maara;
        if (this.saldo < 0) {
            this.saldo = this.saldo + maara;
            return false;
        }
        if (saldo >= 0) {
            return true;
        }
        return false;
    }
}
