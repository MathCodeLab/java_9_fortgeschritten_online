package live_coding.kapitel2_OOPVertiefung;

class Animal{
    String land;

    void essen(){
        System.out.println("I'm an animal. I can eat...");
    }
}

class Katze extends Animal{
    String land;

    void essen(){
        System.out.println("I am a cat. I eat cat food!!!");
    }

    void rufe_beide_Essen_Methoden_auf(){
        this.essen(); // katze can eat
        super.essen(); // animal can eat

        System.out.println(this.land);
        System.out.println(super.land);
    }
}

public class Vererbung_1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.land = "Deutschland";


        Animal animal2 = new Animal();
        animal2.land = "Syrien";


        Katze katze = new Katze();

        animal1.essen(); // animal can eat
        animal2.essen(); // animal can eat
        katze.essen(); // katze can eat

        katze.rufe_beide_Essen_Methoden_auf();
        System.out.println(katze.land);


    }
}
