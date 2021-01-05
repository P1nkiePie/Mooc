public class Maksukortti {
    private double saldo;
    
    
    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo;
    }
    
    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }
    
    public void syoEdullisesti() {
        this.saldo = this.saldo - 2.60;
        if (this.saldo<0) {
            this.saldo = this.saldo + 2.60;
        }
    }
    
    public void syoMaukkaasti() {
        this.saldo = this.saldo - 4.60;
        if (this.saldo<0) {
            this.saldo = this.saldo + 4.60;
        }
    }
    
    public void lataaRahaa(double rahamaara) {
        this.saldo = this.saldo + rahamaara;
        if (rahamaara <= 0) {
            this.saldo = this.saldo + Math.abs(rahamaara);
        }
        if (this.saldo > 150) {
            this.saldo = 150;
        }
    }
    
}
