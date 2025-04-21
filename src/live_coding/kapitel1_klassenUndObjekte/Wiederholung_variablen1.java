package live_coding.kapitel1_klassenUndObjekte;


class Mohammad{

}

class Sarah{

}

class zekra{
}




public class Wiederholung_variablen1 {


    public static void main(String[] args) {

        // dekleration: darf nur EINMAL passieren
        int x;

        // initialisierung
        x = 5;
        System.out.println(x); // 5

        // ueberschreiben
        x = 6;
        System.out.println(x); // 6

        x = 9;
        System.out.println(x); // 9

        // Wert zuweisen
        x = 3;
        System.out.println(x); // 3

        // dekleration und initialisierung gleichzeitig
        int zahl = 7;
        System.out.println(zahl); // 7


        x = zahl;
        System.out.println(zahl); // 7
        System.out.println("zahl"); // zahl
        System.out.println(x); // 7

        zahl = x;
        System.out.println(x); // 7
        System.out.println(zahl); // 7

        System.out.println("Hello World!");
        System.out.println("Hello Zekra!");
        System.out.println("Hello Sara!");

    }




}