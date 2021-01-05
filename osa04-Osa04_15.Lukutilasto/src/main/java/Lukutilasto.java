
public class Lukutilasto {    
    private int lukujenmaara;
    private int summa;
    
    public Lukutilasto() {        
        this.lukujenmaara = 0;
        this.summa = 0;
    }
    
    public void lisaaLuku(int luku) {
        this.summa = this.summa + luku;
        this.lukujenmaara = this.lukujenmaara + 1;
        
    }
    
    public int haeLukujenMaara() {
        return this.lukujenmaara;
    }
    
    public int summa() {
        return this.summa;
    }
    
    public double keskiarvo() {
        if (this.lukujenmaara==0) {
        return 0;
    } 
        return 1.0*this.summa/this.lukujenmaara;
    }
 
}
