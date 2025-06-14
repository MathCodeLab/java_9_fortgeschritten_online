package live_coding.kapitel2_OOPVertiefung;
// abstract class: erlaubt kein Objekt zu erstellen
// abstract methoden:
//                    1. Sie koennen nur in abstract Klassen vorkommen.
//                    2. duerfen kein Koerper (body) haben.
//                    3. Wenn Vererbung: Die sub-klassen Mouse, Pferd muessen den Inhalt der abstract-methoden implmentieren.

abstract class Tier{
    // nicht abstract-methode (regulare/normale methode!!!)
    void wakeUp(){
        System.out.println("Tier is waking up ...");
    }

    // abstract-methode;
    abstract void sleep();

}

class Mouse extends Tier{
    void sleep(){
        System.out.println("mouse schlaeft ZzZzZz...");
    }
}

class Pferd extends Tier {
    void sleep(){
        System.out.println("Pferd schlaeft Huhuhuh...");
    }
}

public class AbstractKlass_3 {
    public static void main(String[] args) {
        // Tier tier = new Tier(); das koennen wir nicht mehr machen, da Tier ein abstract class ist!!!!
        Mouse mouse = new Mouse();
        Pferd pferd = new Pferd();

        // tier.sleep(); // zzz...
        mouse.sleep(); // mzmzmz ...
        pferd.sleep(); // zzz ...

    }
}
