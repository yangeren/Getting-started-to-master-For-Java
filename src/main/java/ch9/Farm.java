package ch9;

/**
 * Created by hanz on 17-10-30.
 */
public class Farm {
  public static void main(String [] args) {
    System.out.println("调用apple");
    Apple apple = new Apple();
    apple.harvest();

    System.out.println("调用orange");
    Orange orange = new Orange();
    orange.harvest();
  }
}
