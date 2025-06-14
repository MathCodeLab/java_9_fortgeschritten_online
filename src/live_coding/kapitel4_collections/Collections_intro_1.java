package live_coding.kapitel4_collections;

import java.util.ArrayList;




public class Collections_intro_1 {
    public static void main(String[] args) {
        String[] myArr1 = {"sdfdssd", "sdf", "sdfds"};
        String[] myArr2 = new String[4];
        myArr2[0] = "all of us";
        myArr2[1] = "love";
        myArr2[2] = "java";
        myArr2[3] = "very much";

        // collections (ArrayList)
        // Auto auto = new Auto();

        ArrayList<String> myArrList = new ArrayList<String>();
        System.out.println(myArrList.size());
        myArrList.add("7");
        myArrList.add("9");
        myArrList.add("5");
        myArrList.addFirst("4");
        myArrList.remove("9");
        System.out.println(myArrList.get(1));

        myArrList.add("7");
        System.out.println(myArrList);


    }
}













