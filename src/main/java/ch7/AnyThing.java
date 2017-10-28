package ch7;

public class AnyThing {
    public AnyThing(){
        this("this 调用有参构造方法");
        System.out.println("无参构造方法");
    }

    public AnyThing(String name) {
        System.out.println("有参构造方法");
    }

    public static void main(String[] args) {
        AnyThing a = new AnyThing();

    }
}
