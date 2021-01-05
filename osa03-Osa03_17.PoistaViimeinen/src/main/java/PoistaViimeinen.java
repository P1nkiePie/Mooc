
import java.util.ArrayList;

public class PoistaViimeinen {

    public static void main(String[] args) {
        
    ArrayList<String> merkkijonot = new ArrayList<>();

    merkkijonot.add("Eka");
    merkkijonot.add("Toka");
    merkkijonot.add("Kolmas");

    System.out.println(merkkijonot);

    poistaViimeinen(merkkijonot);
    poistaViimeinen(merkkijonot);

    System.out.println(merkkijonot);
    }
    
    public static void poistaViimeinen(ArrayList<String> mjonot) {
        
        for (int i=-1; i<mjonot.size(); i++) {
            
            if (mjonot.size()==0) {
                break;
            }
            
            if (i==mjonot.size()-1) {
                mjonot.remove(i);
            }
        }
    }

}
