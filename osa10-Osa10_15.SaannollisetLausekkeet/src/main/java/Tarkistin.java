

public class Tarkistin {
    
    
    
    public boolean onViikonpaiva(String merkkijono) {
        String lyhenteet = "(ma)|(ti)|(ke)|(to)|(pe)|(la)|(su)";
        if (merkkijono.matches(lyhenteet)) return true;
        else return false;
    }
    
    public boolean kaikkiVokaaleja(String merkkijono) {
        String vokaalit = "(a|e|i|o|u|y|ä|ö)*";
        if (merkkijono.matches(vokaalit)) return true;
        else return false;
    }
    
    public boolean kellonaika(String merkkijono)  {
        String aika = "([0-2][0-9]:[0-5][0-9]:[0-5][0-9])";
        if (merkkijono.matches("2[4-9]:[1-5][0-9]:[0-5][0-9]")) return false;
        if (merkkijono.matches(aika)) return true;
        else return false;
    }

}
