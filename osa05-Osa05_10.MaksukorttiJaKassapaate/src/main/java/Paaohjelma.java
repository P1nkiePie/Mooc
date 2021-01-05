
public class Paaohjelma {

    public static void main(String[] args) {
        
        Maksukortti pekanKortti = new Maksukortti(20);
        
        System.out.println("rahaa " + pekanKortti.saldo());
        boolean onnistuiko = pekanKortti.otaRahaa(8);
        System.out.println("onnistuiko otto: " + onnistuiko);
        System.out.println("rahaa " + pekanKortti.saldo());
        
        onnistuiko = pekanKortti.otaRahaa(4);
        System.out.println("onnistuiko otto: " + onnistuiko);
        System.out.println("rahaa " + pekanKortti.saldo());
        
        Kassapaate unicafeExactum = new Kassapaate();
        
        double vaihtorahaa = unicafeExactum.syoEdullisesti(10);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);
        
        vaihtorahaa = unicafeExactum.syoEdullisesti(5);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);
        
        vaihtorahaa = unicafeExactum.syoMaukkaasti(4.3);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);
        
        System.out.println(unicafeExactum.toString());
        
        onnistuiko = unicafeExactum.syoEdullisesti(pekanKortti);
        System.out.println("riittikö raha: " + onnistuiko);
        onnistuiko = unicafeExactum.syoMaukkaasti(pekanKortti);
        System.out.println("riittikö raha: " + onnistuiko);
        
        System.out.println(pekanKortti.saldo());
        System.out.println(unicafeExactum.toString());
        
        onnistuiko = unicafeExactum.syoMaukkaasti(pekanKortti);
        System.out.println("riittikö raha: " + onnistuiko);
        
        unicafeExactum.lataaRahaaKortille(pekanKortti, 100);
        System.out.println(pekanKortti.saldo());
    }
}

