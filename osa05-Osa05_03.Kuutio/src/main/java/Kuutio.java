public class Kuutio {
    private int p;
    
    public Kuutio(int sarmanPituus) {
        this.p = sarmanPituus;
    }
    
    public int tilavuus() {
        return p * p * p;
    }
    
    public String toString() {
        return "Kuution särmän pituus on " + p + ", tilavuus on " + p*p*p;
    }
}
