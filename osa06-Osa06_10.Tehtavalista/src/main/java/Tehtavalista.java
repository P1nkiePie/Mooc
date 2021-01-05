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
import java.util.Scanner;

public class Tehtavalista {
    private ArrayList<String> lista;
    
    public Tehtavalista() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        lista.add(tehtava);
    }
    
    public void tulosta() {
        int i=0;
        while (i<lista.size()) {
            System.out.println((i+1) + ": " + lista.get(i));
            i++;
        }
    }
    
    public void poista(int numero) {
        for (int i = 0; i<numero; i++) {
            if (i==numero-1) {
                this.lista.remove(i);
            }
        }
    }
}
