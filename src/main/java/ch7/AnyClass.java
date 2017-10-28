package ch7;

public class AnyClass {
    public void doString() {
        //
    }

    void doString1() {
        //
    }

    String name = new String();

    public void setName(String name) {
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }

    public AnyClass getName() {
        return this;
    }

    public static void main(String[] args) {
        AnyClass a = new AnyClass();
        a.setName("wanghan");
        System.out.println(a.getName().name);
    }
}

