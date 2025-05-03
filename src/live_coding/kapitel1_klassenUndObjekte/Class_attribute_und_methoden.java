package live_coding.kapitel1_klassenUndObjekte;


/*
Variablen:
    - in einer Klasse -> globale variable Klassvariable = (Klass attribute)
    - in einer Methode -> locale variable

Methoden:
    - in einer Klasse (Klassmethode) definert
    Notiz: Methoden koennen innerhalb einer defineition einer anderen Mehtode aufgerufen werden.

Klassen:
    - Klass-variablen (attribute)
    - Klass-methoden
*/

class Laptop{
    static String model; // global, weil die variable ist (direkt) innerhalb der Klasse definiert.
    static double preis; // global

    static void printSomething1(){
        int gewicht = 5; // local
        System.out.println(gewicht);
        // System.out.println(farbe); // error: weil farbe ist nicht hier definiert
        System.out.println(model);
        System.out.println(Laptop.model);
    }

    static void printSomething2(){
        String farbe = "rot"; // local
        System.out.println(farbe);
        // System.out.println(gewicht); // error: weil gewicht ist nicht hier definiert
        System.out.println(Laptop.preis);
        Laptop.printSomething1(); // aufruf
        System.out.println(11);
    }
}



public class Class_attribute_und_methoden {
    static String name;

    static void printHallo1(int y){
        int x = 7;
        System.out.println(x);
        // System.out.println(y);
        System.out.println("Hallo");
        System.out.println(name);
        System.out.println(Laptop.model);
    }

    static void printHallo1() {
        int y = 7;
        System.out.println(y);
        // System.out.println(x);
        System.out.println("Hallo");
        System.out.println(name);

    }

    public static void main(String[] args) {

        printHallo1(7);
        printHallo1();


        System.out.println(name);
        System.out.println(name);
        System.out.println(Laptop.model);


        Laptop.printSomething1();
        Laptop.printSomething2();
        printHallo1();
    }
}
