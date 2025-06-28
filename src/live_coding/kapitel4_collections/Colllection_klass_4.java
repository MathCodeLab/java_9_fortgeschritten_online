package live_coding.kapitel4_collections;
import java.util.ArrayList;
import java.util.HashSet;


interface Auto{
    void printMaxSpeed();
}

class BMW implements Auto{
    String farbe;

    public void printMaxSpeed(){
        System.out.println("max speed 200 km/h");
    }
    void printnix(){
        System.out.println("nix");
    }
}


class Audi implements Auto{
    public void printMaxSpeed(){
        System.out.println("Max speed 220 km/h");
    }
}


public class Colllection_klass_4 {
    public static void main(String[] args) {

        int x = 5;
        int[] myArr1 = new int[3]; // 3 elemente
        String[] myArr2 = new String[7]; // 3 elemente

        BMW bmw1 = new BMW();
        BMW bmw2 = new BMW();
        bmw1.farbe = "rot";
        bmw2.farbe = "schwarz";

        Audi audi = new Audi();
        ArrayList<String> myArrList1_sarah = new ArrayList<String>();
        ArrayList<String> myArrList2_zekra = new ArrayList<String>();
        myArrList2_zekra.add("Hi");
        myArrList2_zekra.add("zekra");

        System.out.println(myArr1);
        System.out.println(myArrList1_sarah);
        System.out.println(myArrList2_zekra);

        System.out.println(myArrList1_sarah.size()); // 0
        System.out.println(myArrList2_zekra.size()); // 2

//        Auto auto = new Auto(); // von interface darf man kein instanz (objekt erstellen)!!!!
        Auto auto1 = new Audi(); // von interface darf man kein instanz (objekt erstellen)!!!!
        Auto auto2 = new BMW(); // von interface darf man kein instanz (objekt erstellen)!!!!


        ArrayList<Integer> arrayList_moh = new ArrayList<Integer>();
        HashSet<Integer> hashset_moh = new HashSet<Integer>();

        arrayList_moh.add(7);
        System.out.println(arrayList_moh);


//        int z = 5;
        // wrapper
//        Integer y = 7;
//        System.out.println(y.floatValue()); // 7.0f
//
//        String name = "java";
//        System.out.println(name.length()); // 6
















    }
}
