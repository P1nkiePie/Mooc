class Linnut {
    private String nimi;
    private String latinanimi;
    private int havainto;
    
    public Linnut(String nimi, String latinanimi) {
        this.nimi = nimi;
        this.latinanimi = latinanimi;
    }
    
    public String getnimi() {
        return this.nimi;
    }
    
    public void havainto() {
        this.havainto = this.havainto + 1;
    }
    
    public String toString() {
        return this.nimi + " (" + this.latinanimi + "): " + this.havainto + " havaintoa";
    }
}
