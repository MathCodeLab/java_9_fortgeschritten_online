package live_coding.kapitel1_klassenUndObjekte;
class Haustier {
    String name;
    String typ;

    void printSomeThing() {
        String name = "zekra";
        System.out.println("hi");
        System.out.println(name); // zekra
        System.out.println(this.name); // null
    }


    Haustier(String name, String typ){
        this.name = name;
        this.typ = typ;
    }

    Haustier(String name){
        this.name = name;
    }


    Haustier(){
    }

}


class MenschClass{
    String name;

//    MenschClass(){
//    }
}

public class Class_konstruktoren_und_this_8 {
    public static void main(String[] args) {
        MenschClass m = new MenschClass();
        
        
        Haustier haustier1 = new Haustier("lulo", "Katze");
        Haustier haustier2 = new Haustier("fufu");
        Haustier haustier3 = new Haustier();
//
//        haustier1.name = ("lulo");
//        haustier1.typ = ("Katze");
//
//        haustier2.name = ("fufu");
//        haustier2.typ = ("hund");
//
//        haustier3.name = ("uihi");
//        haustier3.typ = ("mouse");




    }
}
