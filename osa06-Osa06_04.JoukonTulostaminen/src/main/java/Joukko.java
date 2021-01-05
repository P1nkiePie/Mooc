
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

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    
    public String toString() {
        String tulostus = "";
        
        for (int i=0; i<alkiot.size(); i++) {
            if (i==alkiot.size()-1) {
                tulostus=tulostus+alkiot.get(i);
                break;
            }
            tulostus=tulostus+alkiot.get(i)+"\n";
        }
        if (alkiot.isEmpty()) {
            return "Joukko " + this.nimi + " on tyhjä.";
        } if (alkiot.size() == 1) {
            return  "Joukossa " + this.nimi + " on " + alkiot.size() + " alkio:\n" + tulostus;
        } else {
            return  "Joukossa " + this.nimi + " on " + alkiot.size() + " alkiota:\n" + tulostus;
        }      
    }
    
}
