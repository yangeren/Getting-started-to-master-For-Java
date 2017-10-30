package ch9;

//内部类的继承
public class OutputInnerClass extends ClassA.ClassB {
    public OutputInnerClass(ClassA a) {
        a.super();
    }
}

class ClassA {
    class ClassB {

    }
}
