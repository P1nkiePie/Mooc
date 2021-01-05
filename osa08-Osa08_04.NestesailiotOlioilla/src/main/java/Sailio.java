public class Sailio {
    private int sisalto;
    
    public Sailio() {
        this.sisalto = this.sisalto;
    }
    
    public void poista(int maara) {
        if (maara<0) maara = 0;
        this.sisalto = this.sisalto - maara;
        sisaltorajat();
    }
    
    public void lisaa(int maara) {
        if (maara<0) maara=0;
        this.sisalto = this.sisalto + maara;
        sisaltorajat();
    }
    
    public int sisalto() {
        return this.sisalto;
    }
    
    public void sisaltorajat() {
        if (this.sisalto > 100 ) this.sisalto = 100;
        if (this.sisalto < 0 ) this.sisalto = 0;
    }
    
    public String toString() {
        return this.sisalto + "/100";
    }
    
}
