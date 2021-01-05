
public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä!
        Paivays paivays = new Paivays(30, 12, 2011);
        System.out.println("Tarkistellun viikon perjantai on " + paivays);
        
        paivays.etene(3);
        System.out.println(paivays);
        
        Paivays uusiPvm = paivays.paivienPaasta(7);
        int vk = 1;
        while (vk <=7) {
            System.out.println("Perjantai " + vk + " viikon kuluttua on " + uusiPvm);
            uusiPvm = uusiPvm.paivienPaasta(7);
            
            vk = vk + 1;
        }
        System.out.println("Päivämäärä 790:n päivän päästä tarkistellusta perjantaista on " + uusiPvm);
          
    }
}
