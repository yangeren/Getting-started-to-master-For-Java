package ch11;

//practice one
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
        System.out.println("大于1000了");
    }
}
