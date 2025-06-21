package live_coding.kapitel4_collections;

//eigenschaften: variablen/attribute, mehtoden
//
//extends:    class erbt eigenschaften von class/interface
//implements: class erbt eigenschaften von class/interface + bietet implemntierung an.
//
//
//Correct:
//        - class extends class
//
//        - interface extends interface
//        - interface extends class
//
//Falsch:
//        - class extends interface

// correct:

//1. class extends class
//2. interface extends interface
//3. class implemnts interface

interface Collection{ // mohammad
    void CollectionMethode1();
}

interface List extends Collection{ // zekra
    void ListMethode1();
    void ListMethode2();
    // void CollectionMethode1(); // das erbt zekra von mohammad (list erbt con colllection)
}

class ArrayList implements List{ // sarah
    int size;
    public void ListMethode1(){
        System.out.println("ListMethode1");
    }
    public void ListMethode2(){
        System.out.println("ListMethode2");
    }
    public void CollectionMethode1(){
        System.out.println("CollectionMethode1");
    }
    void printHi(){
        System.out.println("hi arraylist");
    }
}

class LinkedList implements List{ // Sidra
    public void ListMethode1(){
        System.out.println("myListMethode1");
    }
    public void ListMethode2(){
        System.out.println("myListMethode2");
    }
    public void CollectionMethode1(){
        System.out.println("myCollectionMethode1");
    }
    void printHi(){
        System.out.println("hi linkedlist");
    }
}



public class Collection_simulation_2 {
    public static void main(String[] args) {
        // Collection coll1 = new Collection(); // error: weil Collection ist ein interface
//         List list1 = new List(); // error: weil Collection ist ein interface
        ArrayList arrList1 = new ArrayList();
        LinkedList linkedList1 = new LinkedList();
        List list2 = new ArrayList(); // error: weil Collection ist ein interface
        List list3 = new LinkedList(); // error: weil Collection ist ein interface


        arrList1.ListMethode1(); // geerbt von List (von zekra)
        arrList1.ListMethode2(); // geerbt von List (von zekra)
        arrList1.ListMethode1(); // geerbt von collection durch list (von mohammad aber durch zekra)
        arrList1.printHi();


        linkedList1.ListMethode1(); // geerbt von List (von zekra)
        linkedList1.ListMethode2(); // geerbt von List (von zekra)
        linkedList1.ListMethode1(); // geerbt von collection durch list (von mohammad aber durch zekra)
        linkedList1.printHi();


        list2.ListMethode1();
        list2.ListMethode2();
        list2.CollectionMethode1();

        list3.ListMethode1();
        list3.ListMethode2();
        list3.CollectionMethode1();

    }
}
