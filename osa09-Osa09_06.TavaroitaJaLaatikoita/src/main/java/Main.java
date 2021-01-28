
public class Main {

    public static void main(String[] args) {
        // testaa täällä luokkiesi toimintaa
        
        Laatikko laatikko = new Laatikko(30);
        Laatikko kirjat = new Laatikko(10);
        Laatikko CDLevyt = new Laatikko(3);
        Laatikko laatikoille = new Laatikko(20);
        
        Kirja kirja1 = new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 2);
        Kirja kirja2 = new Kirja("Robert Martin", "Clean Code", 1);
        Kirja kirja3 = new Kirja("Kent Beck", "Test Driven Development", 0.5);

        CDLevy cd1 = new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973);
        CDLevy cd2 = new CDLevy("Wigwam", "Nuclear Nightclub", 1975);
        CDLevy cd3 = new CDLevy("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(kirja1);
        System.out.println(kirja2);
        System.out.println(kirja3 + "\n");

        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3 + "\n");
        
        kirjat.lisaa(kirja1);
        kirjat.lisaa(kirja2);
        kirjat.lisaa(kirja3);
        CDLevyt.lisaa(cd1);
        CDLevyt.lisaa(cd2);
        CDLevyt.lisaa(cd3);
        
        System.out.println(kirjat);
        
        laatikoille.lisaa(cd3);
        
        System.out.println(laatikoille);
    }

}
