import java.util.ArrayList;
public class Pakka {    
    private ArrayList <String> arvot;
    
    public Pakka() {
        this.arvot = new ArrayList<>();    
    }
    
    public void lisaa(String arvo) {
        this.arvot.add(arvo);
    }
    
    public boolean onTyhja() {
        if (this.arvot.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<String> arvot() {
        return this.arvot;
    }   
    
    public String ota() {
        int i = 0;
        String tulostettava = this.arvot.get(i);
        
        while (i<this.arvot.size()) {
            if (i == this.arvot.size()-1) {
                tulostettava=this.arvot.get(i);
                this.arvot.remove(i);
            }
            i++;
        }
        return tulostettava;
    }
        
    
    
}
