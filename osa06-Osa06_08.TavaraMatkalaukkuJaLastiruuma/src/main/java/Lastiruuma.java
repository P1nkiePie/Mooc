import java.util.ArrayList;

public class Lastiruuma {
    private int maksimipaino;
    private int kokoPaino;
    private ArrayList <Matkalaukku> lista;
    
    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.kokoPaino = 0;
        lista = new ArrayList<>();
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        lista.add(laukku);
        kokoPaino = kokoPaino + laukku.yhteispaino();
        if (this.kokoPaino > this.maksimipaino) {
            lista.remove(laukku);
            this.kokoPaino = this.kokoPaino - laukku.yhteispaino();
        } 
    }
    
    public String toString() {
        return this.lista.size() + " matkalaukkua (" + this.kokoPaino + " kg)";
    }
    
    public void tulostaTavarat() {
        for (Matkalaukku laukku: this.lista) {
            laukku.tulostaTavarat();
        }
    }
}
