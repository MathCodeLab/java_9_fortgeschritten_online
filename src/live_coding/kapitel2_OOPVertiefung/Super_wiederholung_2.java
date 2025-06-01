package live_coding.kapitel2_OOPVertiefung;

class BewegungsMaschine{
    String name;
    String farbe;
    double geschwindigkeit;

    BewegungsMaschine(){
    }

    BewegungsMaschine(String name, String farbe, double geschwindigkeit){
        this.name = name;
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
    }

    void print_Attribute_des_Objektes(){
        System.out.println(this.name); // oder einfach nur name
        System.out.println(this.farbe);
        System.out.println(this.geschwindigkeit);
    }

}


class Auto extends BewegungsMaschine {
    int anzahlReifen;

    Auto(){
        super(); // geh zu dem super leeren Konstruktor BewegungsMaschine
    }

    Auto(int anzahlReifen, String name, String farbe){
//        super.name = name;
//        super.farbe=farbe;
//        super.geschwindigkeit=320;

        super(name, farbe, 320); // geh zu dem super Konstruktor BewegungsMaschine
        this.anzahlReifen = anzahlReifen;
    }

//    Auto(){
//        super("Mercedes", "schwarz", 320); // geh zu dem super Konstruktor BewegungsMaschine
//    }
//
//    Auto(int anzahlReifen){
//
////        super("Mercedes", "schwarz", 320); // geh zu dem super Konstruktor BewegungsMaschine
//        this.anzahlReifen = anzahlReifen;
//    }


    void print_Attribute_des_Objektes(){
        System.out.println(this.anzahlReifen);
    }

    void print_beide_printAttribute(){
        this.print_Attribute_des_Objektes();
        super.print_Attribute_des_Objektes();
    }
}


class Flugzeug extends BewegungsMaschine{
    int anzahlSitzPlaetze;
}




public class Super_wiederholung_2 {
    public static void main(String[] args) {
        BewegungsMaschine bm1 = new BewegungsMaschine();
        BewegungsMaschine bm2 = new BewegungsMaschine("Porsche", "rot", 270);


        Auto auto1 = new Auto(); // leeres auto komplett
        auto1.print_beide_printAttribute();


        System.out.println("-------------------");



        Auto auto2 = new Auto(5, "mercedes", "farbe");
        auto2.print_beide_printAttribute();

//        bm1.print_Attribute_des_Objektes();
//        bm2.print_Attribute_des_Objektes();
//

//        auto1.print_Attribute_des_Objektes();
//
//        Auto auto2 = new Auto(4, "weiss");;
//        auto2.print_Attribute_des_Objektes();
//
        int x = 7;
        x = 8;
        System.out.println(x);

        final int MAX_GESCHWINDIGKEIT = 6;
        System.out.println(MAX_GESCHWINDIGKEIT);

    }
}
