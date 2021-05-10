/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.kayttoHallinta;

/**
 *
 * @author rontt
 */
import java.util.*;
import lentokentta.Lentokoneet.Koneet;
import lentokentta.Lentokoneet.Lento;
import lentokentta.Lentokoneet.lentokohteet;

public class Hallinta {

    private Map<String, Koneet> lentokoneet;
    private Map<String, Lento> lennot;
    private Map<String, lentokohteet> paikat;

    public Hallinta() {
        this.lennot = new HashMap<>();
        this.lentokoneet = new HashMap<>();
        this.paikat = new HashMap<>();
    }

    public void lisaaLentokone(String tunnus, int kapasiteetti) {
        Koneet lentokone = new Koneet(tunnus, kapasiteetti);
        this.lentokoneet.put(tunnus, lentokone);
    }

    public void lisaaLento(Koneet lentokone, String lahtotunnus, String kohdetunnus) {
        this.paikat.putIfAbsent(lahtotunnus, new lentokohteet(lahtotunnus));
        this.paikat.putIfAbsent(kohdetunnus, new lentokohteet(kohdetunnus));

        Lento lento = new Lento(lentokone, this.paikat.get(lahtotunnus), this.paikat.get(kohdetunnus));
        this.lennot.put(lento.toString(), lento);
    }

    public Collection<Koneet> getLentokoneet() {
        return this.lentokoneet.values();
    }

    public Collection<Lento> getLennot() {
        return this.lennot.values();
    }

    public Koneet haeLentokone(String tunnus) {
        return this.lentokoneet.get(tunnus);
    }
}
