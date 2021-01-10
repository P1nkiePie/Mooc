
import java.util.Objects;

public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // oliomuuttujille on lisätty määre final, jolloin niiden arvoa ei asetuksen
    // jälkeen voi enää muuttaa
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;
        
        Rekisterinumero muu = (Rekisterinumero) object;
        
        if (!Objects.equals(this.rekNro, muu.rekNro)) return false;
        if (!Objects.equals(this.maa, muu.maa)) return false;
        
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 1;
        hash = 1 * hash + Objects.hashCode(this.rekNro);
        hash = 1 * hash + Objects.hashCode(this.maa);
        
        return hash;
    }

}
