package live_coding.kapitel1_klassenUndObjekte;

// erstelle eine klasse
class Katze{
    String name;
    static String wohnort;
}

public class Static_Class {
    public static void main(String[] args) {
        // erstelle 2 objekte
        Katze katze1 = new Katze();

        System.out.println(katze1.name); // null
        System.out.println(katze1.wohnort); // null

        katze1.name = "lulukatie"; // objekt name initalisieren
        katze1.wohnort = "Latakia";

        System.out.println(katze1.name); // lulukatie
        System.out.println(katze1.wohnort); // Latakia





    }
}
