package live_coding.kapitel1_klassenUndObjekte;

// englisch - deutsch
// zero     -  Null
// null     -  Nichts

// variable, array, class
class Human{
    String name;
    int alter;
    double gewicht;
}

class Animal{
    String typ; // null
    String name; // null
    int alter = 1; // 1 (default)
}

public class ClassnUndObjekte {
    public static void main(String[] args) {

        Human humanObj1 = new Human(); // objekt vom typ Mensch erstellen
        humanObj1.name = "mohammad";
        humanObj1.alter = 21;
        humanObj1.gewicht = 23;
        System.out.println(humanObj1.alter); // 21

        int x = 6;
        Human humanObj2 = new Human();
        System.out.println(humanObj2.alter); // 0
        humanObj2.name = "zekra";
        humanObj2.alter = 13;
        humanObj2.gewicht = 24;
        System.out.println(humanObj2.alter); // 13


        Animal animal = new Animal();
        System.out.println(animal.alter); // 1
        animal.typ = "Katze";
        animal.alter = 3;
        animal.name = "Kuku";
        System.out.println(animal.alter); // 3

        int[] myArray = new int[4];
        myArray[0] = 5;
        myArray[1] = 7;
        myArray[2] = 8;
        myArray[3] = 534;





        System.out.println(myArray[1]); // 7










        //        int[] myArray1 = {234, 23};
//        int[] myArray2 = {4, 2};
//        String[] myArray3 = {"sdfds", "sdfds", "dsfdsf"};
//        String[] myArra4 = {"s", "2sdf3", "fg"};












//        String name1 = "Mohammad";
//        int alter1 = 123;
//        double gewicht1 = 23;
//
//        String name2 = "sarah";
//        int alter2 = 13;
//        double gewicht2 = 3;
//
//        String name3 = "Zekra";
//        int alter3 = 3;
//        double gewich3 = 20;




    }
}
