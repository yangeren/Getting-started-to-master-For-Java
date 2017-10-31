package ch11;

import java.io.InputStream;
import java.util.Scanner;

public class Number {
    private double a;
    private double b;
    private double x;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void count(double a, double b) {
        x = a * b;
    }

    public static void main(String[] args) {
        Number number = new Number();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input one: ");
        String one = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("please input two: ");
        String two = scanner1.nextLine();
        try {
            number.count(
                    Double.valueOf(one.toString()),
                    Double.valueOf(two.toString())
            );
            System.out.println(number.getX());
        } catch (NumberFormatException e) {
//            e.printStackTrace();
            System.out.println("error!!! please input number!");
        }
    }
}
