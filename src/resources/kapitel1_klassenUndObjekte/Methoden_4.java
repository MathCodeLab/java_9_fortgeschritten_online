package resources.kapitel1_grundlagen;

public class Methoden_4 {
    static void meineSpezielleMethode(){
        System.out.println("Hello , I love java");
        System.out.println("mr robot");
        System.out.println("lets do it");
        System.out.println("lets go");
        System.out.println("i do love love java!!!!!!!!");
        System.out.println("how are you");
        System.out.println("falafel");
        System.out.println("npo pause");
        System.out.println("sos");
        System.out.println("------------------");
    }

    static double quadrat1(double zahl){

        double dieQuadrat = zahl * zahl;
        double div = zahl / 2;

        System.out.println(dieQuadrat);
        System.out.println(div);

        return dieQuadrat;
    }

    static void quadrat2(double zahl){

        double dieQuadrat = zahl * zahl;
        double div = zahl / 2;

        System.out.println(dieQuadrat);
        System.out.println(div);
    }

    static int doSomething(int a, int b){
        // System.out.println(a);
        // System.out.println(b);

        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        double div = a / b;

        // System.out.println(sum);
        // System.out.println(sub);
        // System.out.println(mult);
        // System.out.println(div);

        return mult;
    }

    public static void main(String[] args) {
        System.out.println(
                Math.sqrt(9));

        System.out.println(
                Math.pow(2, 3));

        System.out.println(
                Math.pow(5, 3));

        System.out.println(
                Math.pow(2, 5));

        //  --------------
        meineSpezielleMethode();

        //  ten years later
        meineSpezielleMethode();

        // thousend uats later
        meineSpezielleMethode();

        double erg1 = quadrat1(9);
        double erg2 = quadrat1(8);

        double final_erg = erg1 + erg2;
        System.out.println(final_erg);

        // -----------------------------
        quadrat2(9);
        quadrat2(8);


        int x = 6;
        int ergebnis = doSomething(100, 2);
        System.out.println(ergebnis);
        System.out.println(ergebnis);
    }
}
