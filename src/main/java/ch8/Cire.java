package ch8;

public class Cire implements ICalculate {
     public float getArea(float r) {
         float area = PI*r*r;
         return area;
     }

    public float getCircumference(float r) {
        float circumference = 2*PI*r;
        return circumference;
    }

    public static void main(String[] args) {
         Cire cire = new Cire();
         System.out.println(cire.getArea(3.4f));
         System.out.println(cire.getCircumference(3.4f));
    }
}
