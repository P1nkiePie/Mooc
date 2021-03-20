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
import java.util.List;
import java.util.Iterator;

public class Tyontekijat {
    private ArrayList<Henkilo> lista;
    
    public Tyontekijat() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(Henkilo lisattava) {
        this.lista.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattava) {
        this.lista.addAll(lisattava);
    }
    
    public void tulosta() {
        for(Henkilo henkilo: lista) {
            System.out.println(henkilo);
        }
    }
    
    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = this.lista.iterator();
        while (iteraattori.hasNext()) {
            Henkilo henkilo = iteraattori.next();
            if (henkilo.getKoulutus().equals(koulutus)) System.out.println(henkilo);
        }
    }
     
    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = this.lista.iterator();
        while (iteraattori.hasNext()) {
            Henkilo henkilo = iteraattori.next();
            if (henkilo.getKoulutus().equals(koulutus)) iteraattori.remove();
        }
    }
    
}
