public class Velka {
    private double saldo;
    private double korko;
    
    public Velka(double saldoAlussa, double korkokerroinAlussa) {
        this.saldo = saldoAlussa;
        this.korko = korkokerroinAlussa;
    }
    
    public void tulostaSaldo() {
        System.out.println(this.saldo);
    }
    
    public void odotaVuosi() {
        this.saldo = this.saldo*this.korko;
    }
}
