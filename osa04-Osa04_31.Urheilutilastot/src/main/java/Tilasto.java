
public class Tilasto {
    private String joukkue;
    private int pisteet;
    private int maara;
    
    public Tilasto(String joukkue, int pisteet) {
        this.joukkue = joukkue;
        this.pisteet = pisteet;

    }
    
    public String getPelit() {
        return this.joukkue;
    }
    
    public int getPisteet() {
        return this.pisteet;
    }
    
    public void lisaaOttelu() {
        this.maara++;
    }
    
    public String toString() {
        return this.joukkue + " pisteet: " + this.pisteet;
    }
    
}
