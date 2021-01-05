
public class Ohjelma {

    public static void main(String[] args) {
        
        Esine naula = new Esine("Naula", "Remonttitavarat", 2);
        Esine laasti = new Esine("Laasti", "Remonttitavarat");
        Esine rengas = new Esine ("Rengas", 4);
        
        System.out.println(naula);
        System.out.println(laasti);
        System.out.println(rengas);
    }
}
