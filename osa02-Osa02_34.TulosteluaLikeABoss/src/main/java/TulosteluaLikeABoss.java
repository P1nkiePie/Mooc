
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        for (int i=0; i<maara; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        for (int i=0; i<maara; i++) {
            System.out.print(" ");
        }   
    }

    public static void tulostaKolmio(int koko) {
        int p=koko-1;
        int i=1;
        
        while (i<=koko) {
            tulostaTyhjaa(p);
            tulostaTahtia(i);
            p--;
            i++;
        }
    }    

    public static void jouluKuusi(int korkeus) {
        
        int i = 1;
        int jalka = 2;
        
        while (i <= korkeus){
            tulostaTyhjaa(korkeus - i);
            tulostaTahtia(2*i-1);
            i++; 
        }
        for (int p=0; p!=jalka; p++) {
            tulostaTyhjaa(korkeus-2);
            tulostaTahtia(3);
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
