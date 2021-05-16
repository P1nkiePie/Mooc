/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
import java.util.ArrayList;

public class Putki<T> {
    private ArrayList<T> putki;
    
    public Putki() {
        this.putki = new ArrayList<>();
    }
    
    public void lisaaPutkeen(T arvo) {
        this.putki.add(arvo);
    }
    
    public T otaPutkesta() {
        if (this.putki.isEmpty()) return null;
        Object otettava = putki.get(0);
        putki.remove(otettava);
        return (T) otettava;
    }
    
    public boolean onkoPutkessa() {
        if(this.putki.isEmpty()) return false;
        else return true;
    }
}
