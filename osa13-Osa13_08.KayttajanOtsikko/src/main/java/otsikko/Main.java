package otsikko;

import javafx.application.Application;
import java.util.Scanner;


public class Main {
      public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna otsikko: ");
        String otsikko = lukija.nextLine();
        Application.launch(KayttajanOtsikko.class, "--title=" + otsikko);
    }

}
