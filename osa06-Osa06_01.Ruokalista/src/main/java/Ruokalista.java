
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    public void lisaaAteria(String ruoka) {
        if (!(this.ateriat.contains(ruoka))) {
            this.ateriat.add(ruoka);
        } else {
            System.out.println("Ateria on jo listalla!");
        }
            
    }
    
    public void tulostaAteriat() {
        for (String ruoka: this.ateriat) {
            System.out.println(ruoka);
        }
    }
    
    public void tyhjennaRuokalista() {
            this.ateriat.removeAll(ateriat);
    }
}
