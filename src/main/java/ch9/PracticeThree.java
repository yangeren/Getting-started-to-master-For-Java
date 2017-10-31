package ch9;

/*
创建一个接口，在该接口中定义一个方法，然后创建一个类，在类中定义一个形参为接口类型的方法，
并调用接口中的方法，在类的方法中创建一个实现接口的匿名内部类，用于实现接口中的方法。
 */
public class PracticeThree implements PracticeThreeInterface {
    public PracticeThree() {
        class InnerFunc {
            private String a;
            private String b;

            public InnerFunc(String a, String b) {
                this.a = a;
                this.b = b;
            }

            public void printName() {
                System.out.println("printName");
            }

        }
        InnerFunc innerFunc = new InnerFunc("name", "long");
        innerFunc.printName();
    }

    @Override
    public void doSomething() {
        System.out.println("实现");
    }

    public static void main(String[] args) {
        PracticeThree practiceThree = new PracticeThree();
        practiceThree.doSomething();
    }
}
