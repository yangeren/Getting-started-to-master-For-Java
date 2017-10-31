package ch11;

public class CatchException {
    public static void main(String[] args) {
        try {
            System.out.println("进入try语句块");
            @SuppressWarnings("unused")
            Class<?> clazz = Class.forName("");
        } catch (ClassNotFoundException e) {
            System.out.println("进入catch语句块");
            e.printStackTrace();
            System.out.println("离开catch语句块");
        } finally {
            System.out.println("进入finally语句块");
        }
    }
}
