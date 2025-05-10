package live_coding.kapitel1_klassenUndObjekte;

// erstelle eine klasse
class Katze{
    String name; // gehoert zu den Objekten
    static String wohnort; // gehoert zu dem Klass (und auch die Objekte)
}

public class Static_Class4 {

    public static void main(String[] args) {

        System.out.println(Katze.wohnort); // null
        Katze.wohnort = "Homs";
        System.out.println(Katze.wohnort); // homs

        // erstelle 2 objekte (instanzen)
        Katze katze1 = new Katze(); // instanz
        Katze katze2 = new Katze();

        System.out.println(katze1.name); // null
        System.out.println(katze1.wohnort); // homs
        System.out.println(katze2.wohnort); // homs
        System.out.println(Katze.wohnort); // homs

        katze1.name = "lulukatie"; // objekt name initalisieren
        katze1.wohnort = "Latakia";

        System.out.println(katze1.name); // lulukatie
        System.out.println(katze2.name); // null

        System.out.println(katze1.wohnort); // Latakia
        System.out.println(katze2.wohnort); // Lattakia

        // --------------------

        System.out.println(katze2.name); // null
        System.out.println(katze2.wohnort); // Lattakia
        System.out.println(katze1.wohnort); // Lattakia
        System.out.println(Katze.wohnort); // Lattakia

        katze2.name = "mimi";
        katze2.wohnort = "Damaskus";

        System.out.println(katze1.name); // lulukatie
        System.out.println(katze2.name); // mimi
        System.out.println(katze2.wohnort); // damaskus (zugriff durch obj2)
        System.out.println(katze1.wohnort); // damaskus (zugriff durch obj1)
        System.out.println(Katze.wohnort); // damskus (zugriff durch die Klasse selbst)

        Katze.wohnort = "Hama";

        System.out.println(katze2.wohnort); // hama (zugriff durch obj2)
        System.out.println(katze1.wohnort); // hama (zugriff durch obj1)
        System.out.println(Katze.wohnort); // hama (zugriff durch die Klasse selbst)

        Katze katze3 = new Katze();
        katze3.name = "kuku";
        System.out.println(katze3.name); // kuku
        System.out.println(katze3.wohnort); // hama

    }
}

