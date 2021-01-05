
public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
        Velkakirja matinVelkakirja = new Velkakirja();
        matinVelkakirja.asetaLaina("Arto", 19.22);
        matinVelkakirja.asetaLaina("Mikael", 40);
        
        System.out.println(matinVelkakirja.paljonkoVelkaa("Arto"));
        System.out.println(matinVelkakirja.paljonkoVelkaa("Mikael"));
    }
}
