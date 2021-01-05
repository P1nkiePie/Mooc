public class Varasto {
    private String tunnus;
    private String nimi;
    
    public Varasto(String tunnus, String nimi) {
        this.tunnus=tunnus;
        this.nimi=nimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String getTunnus() {
        return this.tunnus;
    }
    
    public boolean equals(Object verrattava) {
        if (this==verrattava) {
            return true;
        }
        if (!(verrattava instanceof Varasto)) {
            return false;
        }
        
        Varasto verrattavaVarasto = (Varasto) verrattava;
        
        if (this.tunnus.equals(verrattavaVarasto.tunnus)) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return this.tunnus + ": " + this.nimi;
    }
    
}
