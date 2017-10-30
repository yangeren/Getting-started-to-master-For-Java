package ch9;

public class OuterClass {
    class innerClass {
        innerClass() {

        }

        public void inf() {

        }
        int y = 0;
    }

    public innerClass doit() {
        int y = 4;
        return new innerClass();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.innerClass in = outer.doit();
    }
}
