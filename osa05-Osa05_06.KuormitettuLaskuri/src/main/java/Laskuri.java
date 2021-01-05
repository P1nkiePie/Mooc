public class Laskuri {
    private int arvo;
    
    public Laskuri(int alkuArvo) {
        this.arvo = alkuArvo;
    }
    
    public Laskuri() {
        this.arvo = 0;
    }
    
    public int arvo() {
        return arvo;
    }
    
    public void lisaa() {
        arvo = arvo + 1;
    }
    
    public void lisaa(int lisays) {
        arvo = arvo + lisays;
        if (lisays <= 0) {
            arvo = arvo + Math.abs(lisays);
        }
    }
    
    public void vahenna() {
        arvo = arvo - 1;
    }
    
    public void vahenna(int vahenna) {
        arvo = arvo - vahenna;
        if (vahenna <= 0) {
            arvo = arvo - Math.abs(vahenna);
        }
    }
}
