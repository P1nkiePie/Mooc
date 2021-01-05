import java.util.ArrayList;
import java.util.HashMap;

public class Sanakirja {

    private HashMap<String, String> kaannokset;

    public Sanakirja() {
        this.kaannokset = new HashMap<>();
    }

    public String kaanna(String sana) {
        if (this.kaannokset.containsKey(sana)) {
            return kaannokset.get(sana);
        } else {
            return null;
        }
    }

    public void lisaa(String sana, String kaannos) {
        this.kaannokset.put(sana, kaannos);
    }
    
}
