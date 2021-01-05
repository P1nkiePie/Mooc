
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
            this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }
    
    public void etene() {
        this.paiva=this.paiva+1;
        if (this.paiva>30) {
            this.paiva=1;
            this.kuukausi=this.kuukausi+1;
            if (this.kuukausi>12) {
                this.kuukausi=1;
                this.vuosi=this.vuosi+1;
            }
        }
    }
    
    public void etene(int montakoPaivaa) {
        this.paiva=this.paiva+montakoPaivaa;
        int i=this.paiva-30;
        if (this.paiva>30) {
            this.paiva=i;
            this.kuukausi=this.kuukausi+1;
            if (this.kuukausi>12) {
                this.kuukausi=1;
                this.vuosi=this.vuosi+1;
            }
        }
    }
    
    public Paivays paivienPaasta(int paivia) {
        Paivays uusiPaivays = new Paivays(this.paiva, this.kuukausi, this.vuosi);
        
        uusiPaivays.paiva=uusiPaivays.paiva+paivia;
        int i=uusiPaivays.paiva-30;
        if (uusiPaivays.paiva>30) {
            uusiPaivays.paiva=i;
            uusiPaivays.kuukausi=uusiPaivays.kuukausi+1;
            if (uusiPaivays.kuukausi>12) {
                uusiPaivays.kuukausi=1;
                uusiPaivays.vuosi=uusiPaivays.vuosi+1;
            }
        }

    return uusiPaivays;
    }

}
