import java.util.ArrayList;

public class Pakkaus {
    private ArrayList<Lahja> lista = new ArrayList<>();
    
    public Pakkaus() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaaLahja(Lahja lahja) {
        lista.add(lahja);
    }
    
    public int yhteispaino() {
        int kokopaino = 0;
        for (Lahja lahja: lista) {
            kokopaino += lahja.getPaino();
        }
        return kokopaino;
    }
    
    
}
