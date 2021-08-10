/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
public class Pari<K, V> {
    private K avain;
    private V arvo;
    
    public Pari(K avain, V arvo) {
        this.avain = avain;
        this.arvo = arvo;
    }
    
    public K getAvain() {
        return this.avain;
    }
    
    public V getArvo() {
        return this.arvo;
    }
    
    public void setArvo(V arvo) {
        this.arvo = arvo;
    }
    
}
