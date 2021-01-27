

public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
        MaksimipainollinenLaatikko laatikko = new MaksimipainollinenLaatikko(10);
        laatikko.lisaa(new Tavara("Saludo", 5));
        laatikko.lisaa(new Tavara("Pirkka", 5));
        laatikko.lisaa(new Tavara("Kopi Luwak", 5));

        System.out.println(laatikko.onkoLaatikossa(new Tavara("Saludo")));
        System.out.println(laatikko.onkoLaatikossa(new Tavara("Pirkka")));
        System.out.println(laatikko.onkoLaatikossa(new Tavara("Kopi Luwak")));
        
    }
}
