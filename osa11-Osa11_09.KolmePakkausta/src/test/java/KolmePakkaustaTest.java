
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.Reflex;
import fi.helsinki.cs.tmc.edutestutils.Reflex.MethodAndReturnType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

@Points("11-09")
public class KolmePakkaustaTest {

    @Test
    public void onLuokat() {
        onLuokka("a.A");
        onLuokka("b.B");
        onLuokka("c.C");
    }

    public void onMetodi(String luokka, String metodinNimi, Class metodinPaluuTyyppi, Class... parametrit) {
        MethodAndReturnType mr = Reflex.reflect(luokka).method(metodinNimi).returning(metodinPaluuTyyppi);
        if (parametrit.length == 0) {
            mr.takingNoParams().requirePublic();
        } else if (parametrit.length == 1) {
            mr.taking(parametrit[0]).requirePublic();
        }
    }

    public void onRajapinta(String luokka) {
        assertTrue("Rajapintaa " + luokka + " ei löydy. Onhan se määritelty muodossa public interface " + luokka + " ...?", Reflex.reflect(luokka).isPublic());
        Class luokkaClass = Reflex.reflect(luokka).getReferencedClass();
        assertTrue("Onhan " + luokka + " rajapinta eli määritelty muodossa public interface " + luokka + "..?", Modifier.isInterface(luokkaClass.getModifiers()));
    }

    public void luokkaPeriiTaiToteuttaaToisen(String luokka, String toinen) {
        assertTrue("Luokkaa " + luokka + " ei löydy. Onhan se määritelty muodossa public class " + luokka + " ...?", Reflex.reflect(luokka).isPublic());
        assertTrue("Luokkaa " + toinen + " ei löydy. Onhan se määritelty muodossa public class " + toinen + " ...?", Reflex.reflect(toinen).isPublic());

        Class luokkaClass = Reflex.reflect(luokka).getReferencedClass();
        Class toinenClass = Reflex.reflect(toinen).getReferencedClass();

        String virhe = "Periihän luokka " + luokka + " luokan " + toinen + "?";
        if (Modifier.isInterface(toinenClass.getModifiers())) {
            virhe = "Toteuttaahan luokka " + luokka + " rajapinnan " + toinen + "?";
        }

        assertTrue(virhe, toinenClass.isAssignableFrom(luokkaClass));

    }

    public void onYksityinenAttribuutti(String luokka, String nimi, Class tyyppi) {
        assertTrue("Luokkaa " + luokka + " ei löydy. Onhan se määritelty muodossa public class " + luokka + " { ...?", Reflex.reflect(luokka).isPublic());
        Class luokkaClass = Reflex.reflect(luokka).getReferencedClass();
        String virhe = "Luokassa " + luokka + " pitäisi olla yksityinen (private) muuttuja " + nimi + ", joka on tyyppiä " + tyyppi + ".";

        Field field = null;

        try {
            field = luokkaClass.getDeclaredField(nimi);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail(virhe);
        }

        assertTrue(virhe, field.getType().equals(tyyppi));

        assertTrue(virhe, Modifier.isPrivate(field.getModifiers()));
    }

    public void rajattuAttribuuttienMaara(String luokka, int maxAttribuutteja) {
        assertTrue("Luokkaa " + luokka + " ei löydy. Onhan se määritelty muodossa public class " + luokka + " { ...?", Reflex.reflect(luokka).isPublic());

        int attribuutteja = Reflex.reflect(luokka).getReferencedClass().getDeclaredFields().length;
        assertTrue("Luokalla " + luokka + " saa olla korkeintaan " + maxAttribuutteja + " attribuuttia. Nyt niitä oli " + attribuutteja + ".", attribuutteja <= maxAttribuutteja);
    }

    public void onViiteToiseenLuokkaan(String mista, String mihin) {
        assertTrue("Luokkaa " + mista + " ei löydy. Onhan se määritelty muodossa public class " + mista + " { ...?", Reflex.reflect(mista).isPublic());
        assertTrue("Luokkaa " + mihin + " ei löydy. Onhan se määritelty muodossa public class " + mihin + " { ...?", Reflex.reflect(mihin).isPublic());

        Class mistaClass = Reflex.reflect(mista).getReferencedClass();
        Class mihinClass = Reflex.reflect(mihin).getReferencedClass();

        Field viite = null;
        for (Field declaredField : mistaClass.getDeclaredFields()) {
            if (declaredField.getType().equals(mihinClass)) {
                viite = declaredField;
                break;
            }
        }

        assertNotNull("Luokasta " + mista + " ei löytynyt viitettä luokkaan " + mihin + ".\nViite lisätään lisäämällä kohdeluokan tyyppinen oliomuuttuja.", viite);
    }

    public void onKokoelmaViiteToiseenLuokkaan(String mista, String mihin) {
        assertTrue("Luokkaa " + mista + " ei löydy. Onhan se määritelty muodossa public class " + mista + " { ...?", Reflex.reflect(mista).isPublic());
        assertTrue("Luokkaa " + mihin + " ei löydy. Onhan se määritelty muodossa public class " + mihin + " { ...?", Reflex.reflect(mihin).isPublic());

        Class mistaClass = Reflex.reflect(mista).getReferencedClass();

        List<Class> kokoelmaTyypit = Arrays.asList(List.class, ArrayList.class, Set.class, HashSet.class, Vector.class, Collection.class);

        Field viite = null;
        for (Field declaredField : mistaClass.getDeclaredFields()) {
            if (kokoelmaTyypit.contains(declaredField.getType())) {
                viite = declaredField;
                break;
            }
        }

        assertNotNull("Luokasta " + mista + " ei löytynyt kokoelmaviitettä luokkaan " + mihin + ".\nViite lisätään kokoelma luokkaan " + mista + ", jonka tyyppiparametrina on " + mihin + ".\nKäytä kokoelman tyyppinä jotain seuraavista:\n" + kokoelmaTyypit.toString(), viite);
        assertNotNull("Luokassa " + mista + " olevassa kokoelmaviitteessä ei ollut tyyppiparametria (esim List<" + mihin + ">)", viite.getGenericType());

        assertTrue("Luokassa " + mista + " olevan kokoelmaviitteen tyyppiparametrin pitäisi olla " + mihin + ", esim. List<" + mihin + ">", viite.getGenericType().getTypeName().contains(mihin));

    }

    public void onLuokka(String kokoLuokka) {
        String pakkaus = "";
        String luokanNimi = "";
        if (kokoLuokka.contains(".")) {
            pakkaus = kokoLuokka.substring(0, kokoLuokka.lastIndexOf("."));
            luokanNimi = kokoLuokka.substring(kokoLuokka.lastIndexOf(".") + 1);
        }

        if (pakkaus.isEmpty()) {
            assertTrue("Luokkaa " + kokoLuokka + " ei löydy. Onhan se määritelty muodossa public class " + kokoLuokka + " { ...?", Reflex.reflect(kokoLuokka).isPublic());
        } else {
            assertTrue("Luokkaa " + luokanNimi + " ei löydy pakkauksesta " + pakkaus + ". Onhan luokka pakkauksessa " + pakkaus + " ja määritelty muodossa:\npackage " + pakkaus + ";\n public class " + kokoLuokka + "  ...?", Reflex.reflect(kokoLuokka).isPublic());
        }

    }
}
