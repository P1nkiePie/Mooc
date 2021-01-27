import java.util.Objects;

public class Tavara {

    private String nimi;
    private int paino;

    public Tavara(String nimi, int paino) {
        this.nimi = nimi;
        this.paino = paino;
    }

    public Tavara(String nimi) {
        this(nimi, 0);
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }
    
     @Override
    public boolean equals(Object object) {
        if (this.nimi == object) return true;
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;
        
       Tavara muu = (Tavara) object;
        
        if (!Objects.equals(this.nimi, muu.nimi)) return false;
        
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 1;
        hash = 5 * hash + Objects.hashCode(this.nimi);
        
        return hash;
    }

}
