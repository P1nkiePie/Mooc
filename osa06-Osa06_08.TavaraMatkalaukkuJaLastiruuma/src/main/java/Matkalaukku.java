import java.util.ArrayList;

public class Matkalaukku {
    private ArrayList <Tavara> lista = new ArrayList<>();
    private int paino;
    private int maxPaino;
    
    public Matkalaukku(int maxPaino) {
        this.lista = new ArrayList<>();
        this.paino = paino;
        this.maxPaino = maxPaino;
    }
    
    public void lisaaTavara(Tavara tavara) {
        this.lista.add(tavara);
        this.paino = this.paino + tavara.getPaino();
        if (this.paino > this.maxPaino) {
            lista.remove(tavara);
            this.paino=this.paino-tavara.getPaino();
        }
    }
    
    public String toString() {
        if (this.lista.isEmpty()) {
            return "ei tavaroita (" + 0 + " kg)";
        }
        if (lista.size()==1) {
            return lista.size() + " tavara (" + this.paino + " kg)";
        }
        return this.lista.size() + " tavaraa (" + this.paino + " kg)";
    }
    
    public void tulostaTavarat() {
        String tulostus = "";
        
        if (this.lista.isEmpty()) {
            System.out.println("ei tavaroita (" + this.paino + " kg)");
        }
        
        for (int i=0; i<lista.size(); i++) {
            if (i==lista.size()) {
                tulostus = tulostus + this.lista.get(i).getNimi() + " (" + this.lista.get(i).getPaino() + " kg)";
            }
            tulostus = tulostus + this.lista.get(i).getNimi() + " (" + this.lista.get(i).getPaino() + " kg)\n";
        }  
        System.out.println(tulostus);
    }
    
    public int yhteispaino() {
        return this.paino;
    }
    
    public Tavara raskainTavara() {
        if(this.lista.isEmpty()) {
            return null;
        } else {
            Tavara painavin = lista.get(0);
            for (Tavara tavara: this.lista) {
                if (painavin.getPaino() < tavara.getPaino()) {
                    painavin = tavara;
                }
            }
            return painavin;
        }
    }
}
