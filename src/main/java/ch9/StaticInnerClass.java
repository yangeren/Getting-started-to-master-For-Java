package ch9;

public class StaticInnerClass {
//    int x = 0;
//    static class Inner {
//        void doitInner() {
//            System.out.println("外部类：" + x);
//        }
//    }

    static int x = 100;
    static class Inner {
        static void doitInner() {
            System.out.println("外部类的成员变量" + x);
        }
        public static void main(String[] args) {
            doitInner();
        }
    }
}
