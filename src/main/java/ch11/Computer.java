package ch11;

//practice three
public class Computer {
    //    private int a;
//    private int b;
    private int result;

    public int getResult() {
        return result;
    }

    public void big(int a, int b) throws MyException {
        if (a < 0 || b < 0) {
            throw new MyException("error");
        } else {
            result = a + b;
        }
    }

    public static void main(String[] args) throws MyException {
        new Computer().big(-10,20);

    }
}
