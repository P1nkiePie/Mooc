import java.util.ArrayList;

public class Tehtavalista {
    private ArrayList<String> tehtavat;
    
    public Tehtavalista() {
        this.tehtavat = new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        tehtavat.add(tehtava);
    }
    
    public void tulosta() {
        int numero = 1;
        for (String tulostettava: tehtavat) {
            System.out.println(numero + ": " + tulostettava);
            numero++;
        }
    }
    
    public void poista(int numero) {
        for (int i=0; i<this.tehtavat.size(); i++) {
            if (i==numero-1) this.tehtavat.remove(this.tehtavat.get(i));
        }
    }
    
    public String toString() {
        String tulostus = "";
        for (int i=0; i<this.tehtavat.size(); i++) {
            int numero = 1;
            tulostus = tulostus + numero + ": " + this.tehtavat.get(i) + "\n";
            numero++;
        }
        return tulostus;
    }
}
