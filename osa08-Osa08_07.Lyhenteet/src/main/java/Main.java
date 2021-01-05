
public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        Lyhenteet lyhenne = new Lyhenteet();
        
        lyhenne.lisaaLyhenne("esim.", "esimerkiksi");
        lyhenne.lisaaLyhenne("jne.", "ja niin edelleen");
        lyhenne.lisaaLyhenne("yms.", "ynnä muuta sellaista");
        
        String teksti = "esim. jne. yms. lol.";
        
        for (String osa: teksti.split(" ")) {
            if (lyhenne.onkoLyhennetta(osa)) {
                osa = lyhenne.haeLyhenne(osa);
            }
            System.out.print(osa);
            System.out.print(" ");
        }
        System.out.println();
    }
}
