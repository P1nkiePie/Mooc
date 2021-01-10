import java.util.HashMap;
import java.util.ArrayList;

public class Ajoneuvorekisteri {    
    private HashMap<Rekisterinumero, String> omistaja;
    
    public Ajoneuvorekisteri() {
        this.omistaja = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (!(this.omistaja.get(rekkari) == null)) return false;
        this.omistaja.put(rekkari, omistaja); return true;
    }
    
    public String hae(Rekisterinumero rekkari) {
        if (this.omistaja.get(rekkari) == null) return null;
        return this.omistaja.get(rekkari);
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        if (this.omistaja.get(rekkari) == null) return false;
        this.omistaja.put(rekkari, null); return true;
    }
    
    public void tulostaRekisterinumerot() {
        ArrayList<Rekisterinumero> lista = new ArrayList<>();
        for (Rekisterinumero rek: this.omistaja.keySet()) {
            if (!(lista.contains(this.omistaja.get(rek)))) {
                lista.add(rek);
            }
            for (int i=0; i<lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
    }
    
    public void tulostaOmistajat() {
        ArrayList<String> lista = new ArrayList<>();
        for (Rekisterinumero rek: omistaja.keySet()) {
            if (!(lista.contains(this.omistaja.get(rek)))) {
                lista.add(omistaja.get(rek));
            }
        }
        for (String omistaja: lista) {
            System.out.println(omistaja);
        }
    }
    
}
