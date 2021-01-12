import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // tee tänne testikoodia
        ArrayList<Henkilo> henkilot = new ArrayList<>();
        Henkilo ada = new Henkilo("Ada Lovelace", "Korsontie 1 03100 Vantaa");
        henkilot.add(ada);
        Henkilo esko = new Henkilo("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        henkilot.add(esko);
        Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
        henkilot.add(olli);
        Opettaja ida = new Opettaja("Ida Koivunen", "Köökarinkuja 7 00840 Helsinki", 5400);
        henkilot.add(ida);
        
        System.out.println(ada);
        System.out.println(esko);        
        System.out.println(olli);
        
        for (int i=0; i<5; i++) {
            olli.opiskele();
        }
        
        System.out.println(olli);
        System.out.println(ida);
        
        tulostaHenkilot(henkilot);
           
    }
    
    public static void tulostaHenkilot(ArrayList<Henkilo> henkilot) {
        for (Henkilo henkilo: henkilot) {
            System.out.print(henkilo);
        }
        System.out.println();
    }

}
