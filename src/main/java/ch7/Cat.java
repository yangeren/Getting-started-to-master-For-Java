package ch7;

import java.awt.*;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private Color color;

    public Cat(String name, int age, double weight, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Cat cat = (Cat) object;
        return name.equals(cat.name) && (age == cat.age)
                && (weight == cat.weight) && (color.equals(cat.color));
    }

    @Override
    public int hashCode() {
        return 7 * name.hashCode() + 11 * new Integer(age).hashCode() +13
                * new Double(weight).hashCode() + 17 * color.hashCode();
    }
}
