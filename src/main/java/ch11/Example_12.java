package ch11;

public class Example_12 {
    public static void showArea(double r) throws NewException {
        if (r <= 20) {
            throw new NewException(r);
        }
        double area = 3.14 * r * r;
        System.out.println("圆的面积是：" + area);
    }

    public static void main(String[] args) {
        try {
            showArea(10);
        } catch (NewException nex) {
            nex.printStackTrace();
            System.out.println(nex);
        }
    }
}
