package live_coding.kapitel3_erweiterteKonzepte;

public class ZweiDimArray {
    public static void main(String[] args) {

        // deklarieren und initialisieren
        int x1 = 7;
        int[] xArr1  = {2, 8, 9};
        System.out.println(xArr1[0]); // 2
        System.out.println(xArr1[1]); // 8
        System.out.println(xArr1[2]); // 23

        // iterieren: <= 2  <= 3-1  < 3
        for (int i=0; i < xArr1.length; i++){
            System.out.println(xArr1[i]);
        }




        xArr1[2] = 17; // umschreiben
        System.out.println(xArr1[2]); // 17

        // 1) deklatieren
        int x2;
        int[] xArr2;


        // 1.5) Speicherplatz allozieren (reservieren)
        xArr2 = new int[3];

        // 2) initialisieren
        x2 = 5;
        System.out.println(xArr2[0]);
        System.out.println(xArr2[1]);
        System.out.println(xArr2[2]);

        xArr2[0] = 100;
        xArr2[1] = 200;
        xArr2[2] = 300;

        System.out.println(xArr2[0]);
        System.out.println(xArr2[1]);
        System.out.println(xArr2[2]);



        // Abkuerzung: schritt 1 mit schritt 1.5 zusammen
        // 1) deklatieren UND 1.5) Speicherplatz allozieren (reservieren)

//        int[] xArr3;
//        xArr3 = new int[3];
        int[] xArr3 = new int[3];


        // Zusammenfassung:
        String[] arr1 = {"3sd","5asd","dasd"};
         // oder
        int[] arr2 = new int[3]; // 3 ist die anzahl der elemente

        // initialsieren ode umschreiben
        arr1[0] = "as4";
        arr2[0] = 2;


        System.out.println("---------------2D array----------------------");

        int[][] arr2d_1 = {{2, 4}, {5, 2}, {1, 7}};
        System.out.println("Laenge des inneren arrays: " + arr2d_1[1].length);
        System.out.println(arr2d_1[1][0]); // 5

        arr2d_1[2][1] = 8;
        System.out.println(arr2d_1[2][1]); // 8

        int[][] arr2d_2 = new int[3][2];

        System.out.println("2d arr ohne schleife");
        System.out.println(arr2d_1[0][0]);
        System.out.println(arr2d_1[0][1]);

        System.out.println(arr2d_1[1][0]);
        System.out.println(arr2d_1[1][1]);

        System.out.println(arr2d_1[2][0]);
        System.out.println(arr2d_1[2][1]);


        System.out.println("=-------2d arr mit schleife");
        // row : zeile
        // columns (col): spalte
        for (int row=0; row<arr2d_1.length; row++){
            for (int col=0; col<arr2d_1[row].length; col++){
                System.out.print(arr2d_1[row][col] + ", ");
            }
            System.out.println();
        }



//        int[] arr1d_1     = {3,44,3}; // 3
//        int[][] arr2d_1   = {{2, 4}, {5, 2}, {1, 7}}; // 3 x 2
        int[][][] arr3d =
                {
                        {
                            {4,6,3,1},
                            {4,6,3,1}
                        },

                        {
                            {4,6,3,1},
                            {4,6,3,1}

                        },

                        {
                            {4,6,3,1},
                            {4,6,3,1}
                        }
                }; //

        System.out.println("-------------");
        System.out.println(arr3d.length); // 3 blauen

        System.out.println(arr3d[0].length); // 2
        System.out.println(arr3d[1].length); // 2
        System.out.println(arr3d[2].length); // 2

        System.out.println(arr3d[0][0].length); // 4

        for (int depth=0; depth<arr3d.length; depth++){ // 3 blauen
//            System.out.println("arr3d.length: " + arr3d.length);
            for (int row=0; row<arr3d[0].length; row++){ // 2 rosa
//                System.out.println("arr3d[0].length: " + arr3d[0].length);
                for (int col=0; col<arr3d[0][0].length; col++){ // 4 gruen
//                    System.out.println("arr3d[0][0].length: " + arr3d[0][0].length);
                    System.out.println(arr3d[depth][row][col]);
                }
            }
        }
    }
}
