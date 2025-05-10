package live_coding.kapitel1_klassenUndObjekte;

class Bird{
    String name;
    int alter;
    double gewicht;

    // Konstruktor!!!!!
    Bird(String VogelName, int VogelAlter, double VogelGewicht){
        name = VogelName;
        alter = VogelAlter;
        gewicht = VogelGewicht;
    }
}

public class Konstruktoren_class7 {
    public static void main(String[] args) {
        Bird bird1 = new Bird("lilo", 12, 32.2);
        Bird bird2 = new Bird("huhu", 45, 234);
        System.out.println(bird1.name); // lilo
        System.out.println(bird2.name); // huhu


        //        Bird bird4 = new Bird();
//        Bird bird1 = new Bird();

//
//        bird1.name = "lilo";
//        bird1.alter = 12;
//        bird1.gewicht = 32.2;
//
//        bird2.name = "dfg";
//        bird2.alter = 15;
//        bird2.gewicht = 3.2;
//
//        bird3.name = "dsfg";
//        bird3.alter = 112;
//        bird3.gewicht = 325.2;
//
//        bird4.name = "ds";
//        bird4.alter = 152;
//        bird4.gewicht = 32.26;

    }
}
