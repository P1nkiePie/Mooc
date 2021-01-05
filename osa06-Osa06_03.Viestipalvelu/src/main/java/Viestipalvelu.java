import java.util.ArrayList;
public class Viestipalvelu {
    private ArrayList<Viesti> lista;
    
    public Viestipalvelu() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(Viesti viesti) {
        if (viesti.getSisalto().length()<=280) {
            this.lista.add(viesti);
        }
    }
    
    public ArrayList<Viesti> getViestit() {
        return this.lista;
    }
   
}
