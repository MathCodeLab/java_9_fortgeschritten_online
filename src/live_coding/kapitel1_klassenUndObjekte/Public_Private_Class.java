package live_coding.kapitel1_klassenUndObjekte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Public_Private_Class {
    public static void main(String[] args) {

        String y = "hi";
        int x = 5;                          // variable
        int[] xArry = new int[4];           // normales array
        Mensch mensch1 = new Mensch();       // normales objekt
        Mensch mensch2 = new Mensch();       // normales objekt
        Mensch mensch3 = new Mensch();
        Katze katze1 = new Katze();// normales objekt
        Katze katze2 = new Katze();// normales objekt

        ArrayList<String> myArryList1 = new ArrayList<>();   // ArrayList. Wrapper: Klassen die primitive datentypen verpacken
        ArrayList<Integer> myArryList2 = new ArrayList<>();   // ArrayList. Wrapper: Klassen die primitive datentypen verpacken
        ArrayList<Mensch> myArryList3 = new ArrayList<>();
        ArrayList<Katze> myArryList4 = new ArrayList<>();

        // ArrayList. Wrapper: Klassen die primitive datentypen verpacken
        myArryList1.add("Sarah");
        myArryList1.add("Zekra");
        myArryList2.add(7);
        myArryList2.add(7);
        myArryList3.add(mensch1);
        myArryList3.add(mensch2);
        myArryList4.add(katze1);
        myArryList4.add(katze2);


        myArryList1.add("sarah");
        myArryList1.add("zekra");


        // ArrayList. Wrapper: Klassen die primitive datentypen verpacken
        myArryList1.add("S");
        myArryList1.add("M");
        myArryList1.add("Z");
        myArryList1.add("F");

        myArryList1.get(1); // M


//        -------------------- graph --------------------
        ArrayList<      ArrayList<String>    > myArryListGruen_graph = new ArrayList<>();


        ArrayList<      String                > myArryList_sarahAdj = new ArrayList<>();
        ArrayList<      String                > myArryList_zekraAdj = new ArrayList<>();
        ArrayList<      String                > myArryList_mohammadAdj = new ArrayList<>();
        ArrayList<      String                > myArryList_fadiAdj = new ArrayList<>();


        myArryList_sarahAdj.add("Z");
        myArryList_sarahAdj.add("M");
        myArryList_sarahAdj.add("F");
        myArryListGruen_graph.add(myArryList_sarahAdj);

        myArryList_zekraAdj.add("S");
        myArryList_zekraAdj.add("M");
        myArryList_zekraAdj.add("F");
        myArryListGruen_graph.add(myArryList_zekraAdj);

        myArryList_mohammadAdj.add("S");
        myArryList_mohammadAdj.add("Z");
        myArryListGruen_graph.add(myArryList_mohammadAdj);

        myArryList_fadiAdj.add("S");
        myArryList_fadiAdj.add("Z");
        myArryListGruen_graph.add(myArryList_fadiAdj);

        System.out.println(myArryList_sarahAdj.contains("F"));
        System.out.println(myArryList_zekraAdj.contains("M"));
        System.out.println(myArryList_fadiAdj.contains("F"));

        System.out.println(myArryListGruen_graph);
        System.out.println(myArryListGruen_graph.get(2).contains("F"));
        System.out.println(myArryListGruen_graph.get(2).contains("S"));
        System.out.println(myArryListGruen_graph.get(2).contains("M"));
        System.out.println(myArryListGruen_graph.get(2).contains("Z"));

        // Hat Knoten Zekra (Adjezentlist am Index 1) zu Konten Sarah ein Kante
        System.out.println(myArryListGruen_graph.get(1).contains("S"));
        System.out.println(myArryListGruen_graph.get(0).contains("Z"));


        HashMap<Integer, String> myHashMap1 = new HashMap<>();
        myHashMap1.put(1,"Monady");
        myHashMap1.put(2,"Tuesday");
        myHashMap1.put(3,"Wednesday");
        myHashMap1.put(4,"Thrusday");
        System.out.println(myHashMap1);



        HashMap<String, Double> myHashMap2 = new HashMap<>();
        myHashMap2.put("Zekra", 1.0);
        myHashMap2.put("Sarah", 1.0);
        myHashMap2.put("Fadi", 5.0);
        System.out.println(myHashMap2);
        System.out.println(myHashMap2.get("Mohammad"));
        System.out.println(myHashMap2.get("Sarah"));
        System.out.println(myHashMap2.get("Zekra"));

        HashMap<    String, ArrayList<Double>    > myHashMap3_Graph = new HashMap<>();

        ArrayList<Double> FadiListe = new ArrayList<>();
        FadiListe.add(5.0);
        FadiListe.add(5.0);
        FadiListe.add(5.0);
        myHashMap3_Graph.put("Fadi", FadiListe);

        ArrayList<Double> ZekraListe = new ArrayList<>();
        ZekraListe.add(1.0);
        ZekraListe.add(1.0);
        ZekraListe.add(1.0);
        myHashMap3_Graph.put("Zekra", ZekraListe);

        System.out.println(myHashMap3_Graph);
        System.out.println(myHashMap3_Graph.get("Zekra").contains(1.0));

    }
}
