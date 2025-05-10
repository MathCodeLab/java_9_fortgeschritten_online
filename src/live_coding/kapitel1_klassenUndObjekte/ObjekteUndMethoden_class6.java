package live_coding.kapitel1_klassenUndObjekte;

class Vogel{
    // class attribute (variablen)
    String type; // null
    double gewicht; // 0.0
    int km; // 0, wieviel dieses vogel soweit (bisher) geflogen ist;
    static String land; // null

    // Methdode: erhoehe den Stand vom Kilometers um den gegebenen Wert (parameter).
    // 1. name der methode
    // 2. parameter/argumente?
    // 3. Klammern? welche? wo?
    // 5. rueckgabe?
    // 4. inhalt (Koerper)
    void fliege(int neueKiloMeters){
        System.out.println("Soweit bin ich: " + km);
        System.out.println("ich fliege dazu: " + neueKiloMeters);

        km = km + neueKiloMeters; // 5 + 10 = 15

        System.out.println("Mein neuer km: " + km);
    }

}

public class ObjekteUndMethoden_class6 {
    public static void main(String[] args) {
        Vogel.land = "Deutschland";
        // vogel1
        Vogel vogel1 = new Vogel();
        vogel1.type = "kanar";
        vogel1.gewicht = 100.5;

        System.out.println(vogel1.km); // 0
        vogel1.km = 5; // 6
        System.out.println(vogel1.km); // 5

//        vogel1.km = vogel1.km + 10; // 6 + 10 = 16
//        vogel1.km = vogel1.km + 20; // 16 + 20 = 36
//        vogel1.km = vogel1.km + 15; // 36 + 15 = 51

        vogel1.fliege(10); // 5 + 10 = 15
        vogel1.fliege(20); // 15 + 20 = 35
        vogel1.fliege(15); // 35 + 15 = 50

        System.out.println(vogel1.km);

        Vogel sarahVogel = new Vogel();
        System.out.println(sarahVogel.km); //
        System.out.println(sarahVogel.land); //  Deutschland
    }
}
