
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        // Kirjoita tulostuskoodi tänne
        for (int i=0; i<taulukko.length; i++) {
            int luku=taulukko[i];
            for (int t=0; t<luku; t++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
