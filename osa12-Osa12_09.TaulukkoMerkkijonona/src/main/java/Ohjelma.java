
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa metodiasi täällä
        int rivit = 2;
        int sarakkeet = 3;
        int[][] matriisi = {
            {3,2,5,6},
            {0,6,3,7}, 
            {6,4,7,4}
        };
        System.out.println(taulukkoMerkkijonona(matriisi));
    }
    
    public static String taulukkoMerkkijonona(int[][] taulukko) {
        StringBuilder palautettava = new StringBuilder();
        for (int i=0; i<taulukko.length; i++) {
            for (int s=0; s<taulukko[i].length; s++) {
                palautettava.append(taulukko[i][s]);
            }
            palautettava.append("\n");
        }
        return palautettava.toString();
    }
}
