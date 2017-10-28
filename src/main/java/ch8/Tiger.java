package ch8;

public class Tiger extends Beast {
    public Tiger() {
        super("条纹");
        super.move();
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        System.out.println(tiger.skin);
    }
}
