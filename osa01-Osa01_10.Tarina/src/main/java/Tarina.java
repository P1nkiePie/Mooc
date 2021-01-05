
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.\n" +
        "Minkä niminen tarinassa esiintyvä hahmo on?");
        String nimi = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String ammatti = lukija.nextLine();
        System.out.println("Tässä tarina:\n"
                + "Olipa kerran " + nimi + ", joka oli ammatiltaan " + ammatti + 
                ".\nMatkatessaan töihin, " + nimi + " mietti arkeaan.\nEhkäpä "
                        + nimi + " ei olekaan koko elämäänsä " + ammatti + ".");

    }
}
