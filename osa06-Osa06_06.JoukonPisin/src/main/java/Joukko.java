
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }
    
    public String pisin() {
        String pisin = "";
        if (alkiot.isEmpty()) {
                return null;
            }
        for (String mjono: alkiot) {
            for (int i=0; i<mjono.length(); i++) {
                if (mjono.length()>pisin.length()) {
                    pisin = mjono;
                }
            }
        }
        return pisin;
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }

}
