package live_coding.kapitel3_erweiterteKonzepte;



public class RekursionKlass1 {
    // void oder int, String (return)
    // parameters
    // wir haben mit rueckgabewert(int), mit parameter(int)
    static int fakultaet(int n){
        if (n>0) {
            int ergebnis = n * fakultaet(n-1);
            return ergebnis;
        }
        else{
            int ergebnis = 1;
            return ergebnis;
        }
    }

//    static int fibunacci(){
//
//    }

    public static void main(String[] args){
        int ergebnis3 = RekursionKlass1.fakultaet(10);
        System.out.println(ergebnis3);





    }
}
