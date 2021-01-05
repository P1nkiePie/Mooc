
public class Main {

    public static void main(String[] args) {
        
        Huone huone = new Huone();
        
        System.out.println("Huone tyhjä? " + huone.onTyhja());
        huone.lisaa(new Henkilo("Lea", 183));
        huone.lisaa(new Henkilo("Kenya", 182));
        huone.lisaa(new Henkilo("Auli", 186));
        huone.lisaa(new Henkilo("Nina", 172));
        huone.lisaa(new Henkilo("Terhi", 185));
        System.out.println("Huone tyhjä? " + huone.onTyhja());

        System.out.println("");
        for (Henkilo henkilo : huone.getHenkilot()) {
            System.out.println(henkilo);
        }
        
        System.out.println();
        System.out.println("Lyhin: " + huone.lyhin());
        System.out.println("");
        for (Henkilo henkilo : huone.getHenkilot()) {
            System.out.println(henkilo);
        }
        
        System.out.println();
        huone.ota();
        for (Henkilo henkilo: huone.getHenkilot()) {
            System.out.println(henkilo);
        }
        
    }
}
