package live_coding.kapitel2_OOPVertiefung;


interface Wohnung{
    String land = "De"; // final + static
    void playMusic(String musicName);
    void putzen();
    void lichtAnmachen();
}

class Wohnzimmer implements Wohnung{
//    int x;
//    void meineSpezielleMethode(){
//        System.out.println("hi");
//    }

    public void playMusic(String musicName){
        System.out.println(musicName);
    }
    public void putzen(){
        System.out.println("putze das schreibtisch und das Regal");
    }
    public void lichtAnmachen() {
        System.out.println("mach das gelbe licht an...");
    }
}

class Balkon implements Wohnung{
    String farbe;
    public void playMusic(String music){
        System.out.println(music);
    }
    public void putzen(){
        System.out.println("giesse pflanzen");
    }
    public void lichtAnmachen() {
        System.out.println("mach das weisse licht an...");
    }
}


public class Interface_Klass_uebung_4 {
    public static void main(String[] args) {

        Balkon balkon2 = new Balkon();
        balkon2.farbe = "rot";
        Wohnung wohnung = balkon2;

        System.out.println(balkon2.farbe);
        // System.out.println(wohnung.farbe);

        // Wohnung wohung = new Wohnung(); // error. von interface duerfen wir kein objekt erstellen
        Wohnzimmer wohnzimmer1 = new Wohnzimmer();
        wohnzimmer1.playMusic("fairouz");
        wohnzimmer1.putzen();

        Balkon balkon1 = new Balkon();
        balkon1.playMusic("um kalthom");
        balkon1.putzen();

        // land ist static, aber auch final
        System.out.println(Wohnzimmer.land);
        System.out.println(Balkon.land);
        System.out.println(balkon1.land);
        System.out.println(wohnzimmer1.land);


        int x = 6;
        x = 7;

        final int y = 8;
        // y = 5; error!


    }
}
