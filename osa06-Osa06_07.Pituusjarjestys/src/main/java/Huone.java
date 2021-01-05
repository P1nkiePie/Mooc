import java.util.ArrayList;

public class Huone {
    private ArrayList<Henkilo> lista = new ArrayList<>();
    
    public Huone() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(Henkilo henkilo) {
       lista.add(henkilo);
    }
    
    public boolean onTyhja() {
        if (this.lista.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Henkilo> getHenkilot() {
        return this.lista;
    }
    
    public Henkilo lyhin() {
        
        if (this.lista.isEmpty()) {
            return null;
        }
        
        Henkilo lyhin = this.lista.get(0);
        
        for (Henkilo hlo: this.lista) {
            if (lyhin.getPituus() > hlo.getPituus()) {
                lyhin = hlo;
            }
        }
        return lyhin;
    }
    
    public Henkilo ota(){
        if (this.lista.isEmpty()) {
            return null;
        }
        Henkilo poista = lyhin();
        this.lista.remove(poista);
        return poista;
    }
}
