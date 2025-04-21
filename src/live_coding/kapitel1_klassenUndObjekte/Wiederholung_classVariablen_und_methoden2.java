package kapitel1_OOP;

class Hund{
    static String name = "fufu";
}

class Mensch {
    // class variablen oder attribute
    static String name = "ahmad";
    static int alter = 5;
    static double gewicht = 3.6;
    static char land = 'D';

    // 1. ohne ruckgabewert (void), ohne argumente(parameters)
    // 2. ohne rueckgabewert (void), mit argumente(parameters)
    // 3. mit ruckgabewert (return), ohne argumente(parameters)
    // 4. mit ruckgabewert (return), mit argumente(parameters)


    // 1. ohne ruckgabewert, ohne argumente(parameters)
    static void printLine(){
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println("-----------");

    }
    static void printStar(){
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
    }
    static void printSymbol(String symbol){
        for(int i=0; i<10; i++){
            System.out.print(symbol);
        }
        System.out.println("");
    }

    // 3. mit ruckgabewert (return), ohne argumente(parameters)
    static String machEtwas(){
        String name = "java";
        int x = 2;
        int y = 5;
        int ergebnis = x*y;

        return name;
    }

    // 4. mit ruckgabewert (return), mit argumente(parameters)
    static int berechneFlaeche(int laenge, int breite){
       int rechteckFlaeche = laenge * breite;

       return rechteckFlaeche;
    }

}

public class Wiederholung_2 {

    // (globale) class variablen oder attribute
    static int y = 3;
    static int alter = 500;

    public static void main(String[] args) {
        // locale variablen
        int x = 7;
        int alter = 100;

        System.out.println(x); // 7
        System.out.println(Wiederholung_2.y); // 3
        System.out.println(Mensch.alter); // 5

        Mensch.alter = 8;
        System.out.println(Mensch.alter); // 8
        System.out.println(alter); // 100
        System.out.println(Wiederholung_2.alter); // 500
        System.out.println(Hund.name);
        System.out.println(Mensch.name);

        System.out.println(Mensch.alter);
        System.out.println(Wiederholung_2.alter);

        System.out.println(Wiederholung_2.y);
        System.out.println(y);

        System.out.println(x);
        System.out.println(Wiederholung_2.alter);
        System.out.println(alter);

//        --------
        // methoden aufrufen
        Mensch.printLine();

        Mensch.printStar();
        Mensch.printStar();
        Mensch.printStar();
        // print ein spezielles symbol nach eingabe der benutzer.
        // print '*' 10 mal nebeneinander und fuer 4 zeilen.
       // Mensch.printFlexibelSymbol('-', 10, 4);

        Mensch.printSymbol("*");

        // 3.
        String z = Mensch.machEtwas();
        System.out.println(z);

        // 4.
        int f1 = Mensch.berechneFlaeche(6, 3);
        int f2 = Mensch.berechneFlaeche(15, 5);
        int f3 = Mensch.berechneFlaeche(8, 4);

        double durchscnitt = (f1 + f2 + f3) / 3;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(durchscnitt);

        Mensch.printSymbol("*");
        for(int i=0; i<10; i++){
            System.out.print("*");
            }
        System.out.println("");






        Mensch.printSymbol("^");

        for(int i=0; i<10; i++){
            System.out.print("^");
        }
        System.out.println("");




        Mensch.printSymbol("%");

        for(int i=0; i<10; i++){
            System.out.print("%");
        }
        System.out.println("");





        Mensch.printSymbol("$");

        for(int i=0; i<10; i++){
            System.out.print("$");
        }
        System.out.println("");








        Mensch.printLine();





        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("************");
        System.out.println("************");
        System.out.println("************");
        System.out.println("************");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println("-----------");


    }

}

