
public class Kasvatuslaitos {
    private int punnitustenMaara;
    
    public Kasvatuslaitos() {
        this.punnitustenMaara = 0;
    }

    public int punnitse(Henkilo henkilo) {
        punnitustenMaara++;
        return henkilo.getPaino();
    }
    
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);
    }
    
    public int punnitukset() {
        return punnitustenMaara;
    }

}
