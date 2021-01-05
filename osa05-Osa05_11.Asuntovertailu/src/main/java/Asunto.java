
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.nelioita) {
            return true;
        }
        return false;
    }
    
    public int hintaero(Asunto verrattava) {
        int ero = (this.neliohinta * this.nelioita) - (verrattava.neliohinta * verrattava.nelioita);
        if (ero < 0) {
            ero = Math.abs(ero);
        }
        return ero;
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        int eka = this.neliohinta*this.nelioita;
        int toka = verrattava.neliohinta*verrattava.nelioita;
        
        if (eka > toka) {
            return true;
        }
        return false;
    }

}
