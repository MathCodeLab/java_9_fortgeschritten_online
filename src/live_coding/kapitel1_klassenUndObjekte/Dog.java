package live_coding.kapitel1_klassenUndObjekte;

public class Dog {
    static String land = "DE";
    int alter = 1;


    public static void main(String[] args) {
        String land = "Br";
        int alter = 55;

        System.out.println(land);
        System.out.println(alter);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        System.out.println(dog1.land); // DE
        System.out.println(dog1.alter); // 1

        System.out.println(dog2.land); // DE
        System.out.println(dog2.alter); // 1

        System.out.println(dog3.land); // DE
        System.out.println(dog3.alter); // 1

        dog1.land = "SYR";
        dog1.alter = 5;

        System.out.println(dog1.land); // syr
        System.out.println(dog1.alter); // 5

        System.out.println(dog2.land); // syr
        System.out.println(dog2.alter); // 1

        System.out.println(dog3.land); // syr
        System.out.println(dog3.alter); // 1



        dog2.land = "FR"; // static
        dog2.alter = 100;

        System.out.println(dog1.land); // FR
        System.out.println(dog1.alter); // 5

        System.out.println(dog2.land); // FR
        System.out.println(dog2.alter); // 100

        System.out.println(dog3.land); // FR
        System.out.println(dog3.alter); // 1


        dog3.land = "SP"; // static
        dog3.alter = 77;

        System.out.println(dog1.land); // SP
        System.out.println(dog1.alter); // 5

        System.out.println(dog2.land); // SP
        System.out.println(dog2.alter); // 100

        System.out.println(dog3.land); // SP
        System.out.println(dog3.alter); // 77

        System.out.println(land); // Br
        System.out.println(alter); // 55
    }
}
