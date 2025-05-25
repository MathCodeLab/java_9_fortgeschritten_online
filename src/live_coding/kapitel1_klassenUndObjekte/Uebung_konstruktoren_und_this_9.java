package live_coding.kapitel1_klassenUndObjekte;

class Elefant {
    String name;
    int alter;
    double gewicht;

    Elefant(){}

    Elefant(String name){
        this.name = name;
    }

    Elefant(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    Elefant(String name, int alter, double gewicht){
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
    }

}
public class Uebung_konstruktoren_und_this_9 {
    public static void main(String[] args) {
        Elefant elefant1 = new Elefant();
        Elefant elefant2 = new Elefant();

        Elefant elefant3 = new Elefant("Elli");
        Elefant elefant4 = new Elefant("Elon", 5);
        Elefant elefant5 = new Elefant("Ellis", 7, 50.5);

        System.out.println(elefant4.name); // Ellon
        System.out.println(elefant4.alter); // 5
        System.out.println(elefant4.gewicht); // 0.0
    }
}
