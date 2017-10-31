package ch11;

public class NewException extends Exception {
    public NewException(String message) {
        super(message);
    }

    public NewException(Double r) {
        System.out.println("发生异常， 圆的半径不能小于20.");
        System.out.println("圆的半径为：" + r);
    }

}
