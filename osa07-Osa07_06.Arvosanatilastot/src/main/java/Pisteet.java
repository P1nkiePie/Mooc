import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pisteet {
    private ArrayList <Integer> lista;
    private int pisteet;
    
    public Pisteet() {
        this.pisteet = this.pisteet;
        this.lista = new ArrayList<>();
    }
    
    public void Lisaa(int luku) {
        lista.add(luku);
    }
    
    public int Hyvaksytyt() {
        int hyvaksytyt = 0;
        for (int i=0; i<this.lista.size(); i++) {
            if (lista.get(i)>=50&&(lista.get(i)<=100)) {
                hyvaksytyt++;
            }
        }
        return hyvaksytyt;
    }
    
    public double keskiarvo() {
        int summa = 0;
        for (int i=0; i<lista.size(); i++) {
            summa = summa + lista.get(i);
        }
        return summa/lista.size();
    }
    
    public double hyvaksyttyProsenttiosuus(Pisteet pisteet) {
        return 1.0*100*this.Hyvaksytyt()/pisteet.lista.size();
    }
    
    public void tulostaTahtia() {
        Collections.sort(this.lista);
        int viisi = 0;
        int nelja = 0;
        int kolme = 0;
        int kaksi = 0;
        int yksi = 0;
        int nolla = 0;
        for (int i=0;i<lista.size();i++) {
            if (lista.get(i)<50&&(lista.get(i)>=0)) {
                nolla++;
            }
            if (lista.get(i)<60&&(lista.get(i)>=50)) {
                yksi++;
            }
            if (lista.get(i)<70&&(lista.get(i)>=60)) {
                kaksi++;
            }
            if (lista.get(i)<80&&(lista.get(i)>=70)) {
                kolme++;
            }
            if (lista.get(i)<90&&(lista.get(i)>=80)) {
                nelja++;
            }
            if (lista.get(i)<=100&&(lista.get(i)>=90)) {
                viisi++;
            }
        }
        ArrayList <Integer> jakauma = new ArrayList<>();
        jakauma.add(nolla);
        jakauma.add(yksi);
        jakauma.add(kaksi);
        jakauma.add(kolme);
        jakauma.add(nelja);
        jakauma.add(viisi);
        
        int num = 0;
        for (int i=0; i<jakauma.size();i++) {
            String tuloste = "";
            String tahti = "";
            for (int p=0; p<jakauma.get(i); p++) {
                tahti = tahti + "*";
            }
            tuloste = num + ": " + tahti;
            num++;
            System.out.println(tuloste);
        }
    }
    
}
    

