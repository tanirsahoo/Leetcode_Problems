public class test {
//    void calculate(int a, long b) {
//        System.out.println("int, long");
//    }
//
//    void calculate(long a, int b) {
//        System.out.println("long, int");
//    }

    void calculate(short a, short b) {
        System.out.println("short, short");
    }

//    void calculate(int a, int b) {
//        System.out.println("int, int");
//    }

    public static void main(String[] args) {
        test obj = new test();
        obj.calculate((short)10, (short)20);
//        obj.calculate(10L, 20L);
//        obj.calculate(10L, 20L);
    }
}
