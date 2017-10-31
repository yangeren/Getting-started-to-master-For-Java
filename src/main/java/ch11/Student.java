package ch11;

//practiceone
public class Student {
    public void speak(int m) throws MyException {
        if (m > 1000) {
            throw new MyException("max > 1000");
        } else {
            System.out.println("good job");
        }
    }

    public static void main(String[] args) throws MyException {
        new Student().speak(10333);
    }

}
