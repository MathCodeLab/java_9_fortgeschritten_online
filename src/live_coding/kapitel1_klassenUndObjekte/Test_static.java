package live_coding.kapitel1_klassenUndObjekte;

public class Test_static {

    static int staticCount = 3;
    int instanceCount = 7;

    void increment() {
        staticCount++;
        instanceCount++;
    }

    public static void main(String[] args) {

        int staticCount = 1;
        int instanceCount = 2;

        Test_static a = new Test_static();
        Test_static b = new Test_static();
        Test_static c = new Test_static();

        System.out.println(a.staticCount); // 3
        System.out.println(a.instanceCount); // 7

        System.out.println(b.staticCount); // 3
        System.out.println(b.instanceCount); // 7

        System.out.println(c.staticCount); // 3
        System.out.println(c.instanceCount); // 7

        a.increment();
        System.out.println(a.staticCount); // 4
        System.out.println(a.instanceCount); // 8

        System.out.println(b.staticCount); // 4
        System.out.println(b.instanceCount); // 7

        System.out.println(c.staticCount); // 4
        System.out.println(c.instanceCount); // 7


        b.increment();
        System.out.println(a.staticCount); // 5
        System.out.println(a.instanceCount); // 8

        System.out.println(b.staticCount); // 5
        System.out.println(b.instanceCount); // 8

        System.out.println(c.staticCount); // 5
        System.out.println(c.instanceCount); // 7


        c.increment();
        System.out.println(a.staticCount); // 6
        System.out.println(a.instanceCount); // 8

        System.out.println(b.staticCount); // 6
        System.out.println(b.instanceCount); // 8

        System.out.println(c.staticCount); // 6
        System.out.println(c.instanceCount); // 8

        System.out.println("1. Counter.staticCount: " + Test_static.staticCount); // 6
        System.out.println("2. b.staticCount: " + b.staticCount); // 6
        System.out.println("3. b.instanceCount: " + b.instanceCount); // 8
        System.out.println("4. Local staticCount: " + staticCount); // 1
        System.out.println("5. Local instanceCount: " + instanceCount); // 2
    }
}