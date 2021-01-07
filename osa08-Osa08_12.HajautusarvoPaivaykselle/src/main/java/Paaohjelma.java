
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia
        Paivays m = new Paivays(2, 9, 1994);
        Paivays l = new Paivays(18, 5, 1997);
        
        System.out.println(m.hashCode());
        System.out.println(l.hashCode());
    }
}
