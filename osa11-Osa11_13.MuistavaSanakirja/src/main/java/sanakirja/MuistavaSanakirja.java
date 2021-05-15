/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

/**
 *
 * @author rontt
 */
import java.util.*;
import java.io.*;

public class MuistavaSanakirja {
    private ArrayList<String> sanakirja;
    private String tiedosto;
    
    public MuistavaSanakirja() {
        this.sanakirja = new ArrayList<>();
    }
    
    public MuistavaSanakirja(String tiedosto) {
        this();
        this.tiedosto = tiedosto;
    }
    
    public boolean loytyyko(String sana) {
        boolean loytyi = false;
        for (String rivi: sanakirja) {
            if (rivi.contains(sana)) {
                loytyi = true;
            }
        }
        return loytyi;
    }
    
    public void lisaa(String sana, String kaannos) {
        if (loytyyko(sana) == false && loytyyko(kaannos) == false) {
            sanakirja.add(sana + ":" + kaannos);
        }
    }
    
    public String kaanna(String sana) {
        for(String rivi: sanakirja) {
            if (rivi.contains(sana)) {
                String[] palat = rivi.split(":");
                if (palat[0].equals(sana)) return palat[1];
                if (palat[1].equals(sana)) return palat[0];
            }
        }
        return null;
    }
    
    public boolean lataa() {
        try (Scanner txtLukija = new Scanner(new File(tiedosto))) {
            while (txtLukija.hasNextLine()) {
                String rivi = txtLukija.nextLine();
                String[] palat = rivi.split(":");
                this.lisaa(palat[0], palat[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean tallenna() {
        try (PrintWriter rivi = new PrintWriter(tiedosto)) {
            for (int i=0; i<sanakirja.size(); i++) {
                rivi.println(sanakirja.get(i));
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public void poista(String sana) {
        if (loytyyko(sana)==true) {
            for (String rivi: sanakirja) {
                String[] sanat = rivi.split(":");
                if (sanat[0].equals(sana) || sanat[1].equals(sana)) {
                    sanakirja.remove(rivi);
                    break;
                }                    
            }
        }
    }
}
