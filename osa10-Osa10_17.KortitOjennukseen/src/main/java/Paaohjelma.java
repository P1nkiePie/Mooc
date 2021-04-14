import java.util.*;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        
        ArrayList<Kortti> kortit = new ArrayList<>();

        kortit.add(new Kortti(3, Maa.PATA));
        kortit.add(new Kortti(2, Maa.RUUTU));
        kortit.add(new Kortti(14, Maa.PATA));
        kortit.add(new Kortti(12, Maa.HERTTA));
        kortit.add(new Kortti(2, Maa.PATA));

        SamatMaatVierekkainArvojarjestykseen samatMaatVierekkainJarjestaja = new SamatMaatVierekkainArvojarjestykseen();
        Collections.sort(kortit, samatMaatVierekkainJarjestaja);

        kortit.stream().forEach(k -> System.out.println(k));
    }
}
