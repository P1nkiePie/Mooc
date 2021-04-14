/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rontt
 */
import java.util.*;

public class Kasi implements Comparable<Kasi> {
    private ArrayList<Kortti> kasi;
    
    public Kasi() {
        this.kasi = new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti) {
        kasi.add(kortti);
    }
    
    public void tulosta() {
        kasi.stream()
            .forEach(luettu -> System.out.println(luettu));
    }
    
    public void jarjesta() {
        Collections.sort(kasi);
    }
    
    public int getKadenSumma() {
        return (this.kasi.stream().mapToInt(i -> i.getArvo()).sum());
    }
    
    @Override
    public int compareTo(Kasi kasi) {
        return this.getKadenSumma() - kasi.getKadenSumma();
    }
    
    public void jarjestaMaittain() {
        Collections.sort(this.kasi, new SamatMaatVierekkainArvojarjestykseen());
    }
    
    
}
