public class Kirja {
    private String kirjailija;
    private String nimi;
    private int sivut;
    
    public Kirja(String kirjailija, String nimi, int sivut) {
        this.kirjailija = kirjailija;
        this.nimi = nimi;
        this.sivut = sivut;
    }
    
    public String getKirjailija() {
        return kirjailija;
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public int getSivuja() {
        return sivut;
    }
    
    public String toString() {
        return kirjailija + ", " + nimi + ", " + sivut + " sivua";
    }
}
