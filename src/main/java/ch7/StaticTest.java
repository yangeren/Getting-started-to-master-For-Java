package ch7;

public class StaticTest {
    static double PI = 3.1415;
    static int id;
    public static void method1() {
        // method1
    }

    public void method2(){
        System.out.println(StaticTest.PI);
        System.out.println(StaticTest.id);
        StaticTest.method1();
    }

//    public static StaticTest method3(){
//        method1();
//        method3();
//    }
}
