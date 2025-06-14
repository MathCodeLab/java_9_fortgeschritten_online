package live_coding.kapitel2_OOPVertiefung;
// Interface: abstract class mit nur abstract methoden:
// - abstract class KLASSNAE{} --> interface KLASSNAME
// - alle methoden haben kein body
//      -> die Methoden sind automatisch abstract
//      -> damit brauchen wir das keyword abstract nicht mehr zu schreiben
// - die Klasse, die von der super class (von derm Interface) erbt, muss ab jetzt das keyword "implments" anstelle von "extends" verwenden.
// - variablen in interface sid static und final


// abstract class: erlaubt kein Objekt zu erstellen
// abstract methoden:
//                    1. Sie koennen nur in abstract Klassen vorkommen.
//                    2. duerfen kein Koerper (body) haben.
//                    3. Wenn Vererbung: Die sub-klassen Mouse, Pferd muessen den Inhalt der abstract-methoden implmentieren.

interface Tierchen {
    void wakeUp();  // abstract-methode automatisch
    void sleep(); // abstract-methode automatisch
}


//-----------------------------------------------------------------


class Maeuschen implements Tierchen {
    public void sleep(){
        System.out.println("mouse schlaeft ZzZzZz...");
    }

    public void wakeUp(){
        System.out.println("klein mouse is waking up");
    }

}

//-----------------------------------------------------------------


class Pferdchen implements Tierchen {
    public void sleep(){
        System.out.println("Pferd schlaeft Huhuhuh...");
    }

    public void wakeUp(){
        System.out.println("klein pferd is waking up");
    }
}





public class InterfaceKlasse_4 {
    public static void main(String[] args) {

    }
}
