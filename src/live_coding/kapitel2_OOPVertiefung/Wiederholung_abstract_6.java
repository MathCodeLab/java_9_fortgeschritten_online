package live_coding.kapitel2_OOPVertiefung;
// abstract class: kein objekt
// abstract methoden:
//                  1. kein body fuer methoden.
//                  2. alle Klassen die von dieser Super class erben, muessen diese methode implmentieren

abstract class Computer{
    void printName(){
        System.out.println("Computer");
    }
    abstract void printDatum();
}



class Laptop extends Computer{
    void printHallo(){
        System.out.println("Hallo");
    }

    void printDatum(){
        System.out.println("21.06.2025");
    }
}



class Mobile extends Computer{
    void printDatum(){
        System.out.println("21. juni 2025");
    }
}




public class Wiederholung_abstract_6 {
    public static void main(String[] args) {
//        Computer comp1 = new Computer();

        Computer comp1 = new Laptop();
        Computer comp2 = new Mobile();

        comp1.printDatum();
        comp2.printDatum();
        comp1.printName();
//
////        comp1.printName();
//        Laptop laptop = new Laptop();
//        laptop.printName(); // computer
//        laptop.printHallo(); // hallo
//        laptop.printDatum(); // 21.06.2025
//
//        Mobile mob = new Mobile();
//        mob.printName(); // Computer
//        mob.printDatum(); // 21. juni. 2025

    }
}
