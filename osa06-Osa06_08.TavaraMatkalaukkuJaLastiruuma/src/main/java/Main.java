
public class Main {

    public static void main(String[] args) {
        
        Tavara puhelin = new Tavara("Moto Z", 1);
        Tavara kirja = new Tavara ("Puuhapete", 2);
        Tavara tietokone = new Tavara ("Custom pc", 15);
        
        System.out.println("Kirja: " + kirja);
        System.out.println("Puhelin: " + puhelin);
        System.out.println("Tietokone: " + tietokone);
        
        Matkalaukku matkalaukku = new Matkalaukku(20);
        System.out.println(matkalaukku);
        
        matkalaukku.lisaaTavara(kirja);
        System.out.println(matkalaukku);
        
        matkalaukku.lisaaTavara(puhelin);
        System.out.println(matkalaukku);
        
        matkalaukku.lisaaTavara(tietokone);
        System.out.println(matkalaukku);
        
        matkalaukku.tulostaTavarat();
        System.out.println(matkalaukku.yhteispaino());
        
    }

}
