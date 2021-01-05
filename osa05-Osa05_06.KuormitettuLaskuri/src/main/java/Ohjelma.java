
public class Ohjelma {

    public static void main(String[] args) {
        
        Laskuri laskuri = new Laskuri(5);
        
        System.out.println(laskuri.arvo());
        
        laskuri.lisaa();
        laskuri.lisaa(3);
        
        System.out.println(laskuri.arvo());
        
        laskuri.vahenna(1);
        
        System.out.println(laskuri.arvo());
        
    }
}
