
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        int i = 0;
        String tahti = "*";
        
        while (i != maara) {
            System.out.print(tahti);
            i++; 
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        int leveys = sivunpituus;
        String tahti ="*";
        
        for (int i=0; i!=sivunpituus; i++) {
            for (int s=0; s!=leveys; s++) {
                System.out.print(tahti);
            }
            System.out.println("");
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        String tahti = "*";
        
        for (int i=0; i!=korkeus; i++) {
            for (int l=0; l!=leveys; l++) {
                System.out.print(tahti);
            }
            System.out.println("");
        }
        
    }

    public static void tulostaKolmio(int koko) {
        String tahti="*";
        int maara = 1;
        
        for (int i=0; i!=koko; i++) {
            for (int p=0; p!=maara; p++) {
                System.out.print(tahti);
            }
            System.out.println("");
            maara++;
        }
    }
}
