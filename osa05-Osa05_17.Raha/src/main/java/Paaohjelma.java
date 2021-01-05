
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
        Raha a = new Raha(10,0);
        Raha b = new Raha(5,0);
        
        Raha c = a.plus(b);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        a=a.plus(c);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
