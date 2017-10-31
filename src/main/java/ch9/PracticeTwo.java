package ch9;
/*
创建一个类，在该类中定义一个方法，并在方法内部创建一个局部内部类，
通过局部内部类求任意两个数的乘积，并在外部类中进行测试。
 */
public class PracticeTwo {
    public void getMeth() {
        class Abb {
            private double x;
            private double y;

            public Abb(double x, double y) {
                this.x = x;
                this.y = y;
            }

            public double getX() {
                return x;
            }

            public double getY() {
                return y;
            }

            public void getResult() {
//                double result = this.x * this.y;
                System.out.println(this.x * this.y);
            }
        }

        Abb abb = new Abb(12, 22);
        abb.getResult();
    }

    public static void main(String[] args) {
        PracticeTwo practiceTwo = new PracticeTwo();
        practiceTwo.getMeth();

    }
}
