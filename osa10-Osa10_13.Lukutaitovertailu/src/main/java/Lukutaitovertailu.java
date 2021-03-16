import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {   
  
        ArrayList<Lukutaito> lista = new ArrayList<>();
        try{
            Files.lines(Paths.get("lukutaito.csv"))
                .map(rivi -> rivi.split(","))
                .map(palat -> new Lukutaito(palat[2].substring(0, palat[02].length() -4).trim(), palat[3].trim(), Integer.valueOf(palat[4].trim()), Double.valueOf(palat[5].trim())))
                .forEach(lukutaito -> lista.add(lukutaito));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        lista.stream().sorted().forEach(lukutaito -> System.out.println(lukutaito));
    }
}
