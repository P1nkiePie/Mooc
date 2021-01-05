public class Mittari {
    
    private int mitta;
    
    public Mittari() {
        
    }
    
    public void lisaa() {
        this.mitta = this.mitta + 1;
        if (this.mitta >= 5) {
            this.mitta = 5;
        }
    }
    
    public void vahenna() {
        this.mitta = this.mitta - 1;
        if (this.mitta <= 0) {
            this.mitta = 0;
        }
    }
    
    public int mitta() {
        return this.mitta;
    }
    
    public boolean taynna() {
        if (this.mitta == 5) {
            return true;
        } else {
            return false;
        }
    }
    
}
