package live_coding.kapitel2_OOPVertiefung;

interface Rechner{
    void printHallo();
    void printHi();
}

class Telefon implements Rechner {
    public void printHallo(){
        System.out.println("hallllooooooo.....");
    }

    public void printHi(){
        System.out.println("Heiiiiiiiii");
    }
}

class Ipad implements Rechner{
    public void printHallo(){
        System.out.println("halloechen.....");
    }

    public void printHi(){
        System.out.println("heyyyyyyyyyyyyyyyyyyyyyyy");
    }

}

public class Wiederholung_interface_7 {
    public static void main(String[] args) {
//        Rechner rechner = new Rechner(); // error
        Rechner rechner1 = new Telefon();
        Rechner rechner2 = new Ipad();

        Telefon tel = new Telefon();
        Ipad ipad = new Ipad();
    }
}
