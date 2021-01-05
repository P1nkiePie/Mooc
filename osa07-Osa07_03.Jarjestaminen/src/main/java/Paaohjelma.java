import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 5, 1, 99, 3, 12};
        
        System.out.println("Pienin: " + Paaohjelma.pienin(taulukko));
        System.out.println("Pienimmän indeksi: " + Paaohjelma.pienimmanIndeksi(taulukko));
        
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(taulukko, 0));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(taulukko, 1));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(taulukko, 2));
        
        System.out.println(Arrays.toString(taulukko));
        Paaohjelma.vaihda(taulukko, 1, 0);
        System.out.println(Arrays.toString(taulukko));
        
        Paaohjelma.jarjesta(taulukko);
    }
    
    public static int pienin(int[] taulukko) {
        int pienin = 1000;
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
            }
        }
        return pienin;
    }
    
    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = 1000;
        int Indeksi = 0;
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                Indeksi = i;
            }
        }
        return Indeksi;
    }
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
         int pienin = 1000;
        int Indeksi = 0;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                Indeksi = i;
            }
        }
        return Indeksi;
    }
    
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int eka = 0;
        int toka = 0;
        for (int i = 0; i < taulukko.length; i++) {
            if (i == indeksi1) {
                eka = i;
            } if (i == indeksi2) {
                toka = i;
            }
        }
        int apu = taulukko[eka];
        taulukko[eka] = taulukko[toka];
        taulukko[toka] = apu;
    }
    
    public static void jarjesta(int[] taulukko) {
        int indeksi = 0;
        System.out.println(Arrays.toString(taulukko));
        for (int i=0; i<taulukko.length; i++) {
            indeksi = pienimmanIndeksiAlkaen(taulukko, i);
            vaihda(taulukko, i, indeksi);
            System.out.println(Arrays.toString(taulukko));
        }
    }

}
