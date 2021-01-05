
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> pisteet;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.pisteet = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
        this.pisteet.add(pisteet);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    
    public double arvosanojenKeskiarvo() {
        int summa = 0;
        int lkm = 0;
        
        if (this.arvosanat.size()<=0) {
            return -1;
        } else {
            for (int i=0; i<this.arvosanat.size(); i++) {
                int luku = this.arvosanat.get(i);
                summa = summa + luku;
                lkm++;
                if (i==this.arvosanat.size()) {
                }    
            }
        }
        double keskiarvo = 1.0*summa/lkm;
        return keskiarvo;
    }
    
    public double koepisteidenKeskiarvo() {
        int summa = 0;
        int maara = 0;
        if (this.pisteet.isEmpty()) {
            return -1;
        }
        for (int i=0; i<this.pisteet.size(); i++) {
            int luku = this.pisteet.get(i);
            summa = summa + luku;
            maara++;
        }
        double keskiarvo = 1.0*summa/maara;
        return keskiarvo;
    }
}
