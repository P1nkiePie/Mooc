
public class VahenevaLaskuri {

    private int arvo;  // oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        this.arvo = this.arvo-1;
        if (this.arvo <= 0) {
            this.arvo = 0;
        }
    }
    
    public void nollaa() {
        this.arvo = 0;
    }
}
