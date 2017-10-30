package ch9;

/**
 * Created by hanz on 17-10-30.
 */
abstract class Fruit {

  public String color;
  public Fruit() {
    color = "绿色";
  }

  public abstract void harvest();
}
