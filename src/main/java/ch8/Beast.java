package ch8;

public class Beast {
    String skin = "";
    public Beast() {

    }

    public Beast(String strSkin) {
        skin = strSkin;
    }

    public void move() {
        System.out.println("run!");
    }
}
