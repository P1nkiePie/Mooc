
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

        List<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(17);
        luvut.add(6);
        luvut.add(8);

        System.out.println("Lukuja: " + luvut.stream().count());
    }
    
    public static List<Integer> positiiviset(List<Integer> luvut) {
        return luvut.stream().filter(luku -> luku > 0)
                .collect(Collectors.toList());
    }

}
