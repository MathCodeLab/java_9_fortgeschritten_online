package live_coding.kapitel4_collections;

import java.util.ArrayList;

public class Collection_struktur_3 {
    public static void main(String[] args) {

        ArrayList<String> arrlist1 = new ArrayList<String>();

        boolean erg3 = arrlist1.isEmpty();
        System.out.println(erg3); // true

        arrlist1.add("mohammad");
        System.out.println(arrlist1);

        arrlist1.add("zekra");
        System.out.println(arrlist1);

        arrlist1.add("sarah");
        System.out.println(arrlist1);

        arrlist1.set(2, "sidra");
        System.out.println(arrlist1);

        String ergebnis = arrlist1.get(0);
        System.out.println(ergebnis); // mohammad

        boolean erg2 = arrlist1.isEmpty();
        System.out.println(erg2); // false

        arrlist1.add(2, "test");
        System.out.println(arrlist1);

        arrlist1.remove(2);
        System.out.println(arrlist1);

        arrlist1.add("Ali");
        arrlist1.add("Ali");
        System.out.println(arrlist1);

        arrlist1.remove("Ali"); // loescht das erste Vorkommen von Ali
        System.out.println(arrlist1);

    }
}
