package ch7;

import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.*;

public class CatTest {
    @Test
    public void testEquals() throws Exception {
        Cat cat1 = new Cat("JAVA", 12, 21, Color.BLACK);
        Cat cat2 = new Cat("C++", 12, 21, Color.WHITE);
        Cat cat3 = new Cat("JAVA", 12, 21, Color.BLACK);

        System.out.println("猫咪1号的哈希码： " + cat1.hashCode());
        System.out.println("猫咪2号的哈希码： " + cat2.hashCode());
        System.out.println("猫咪3号的哈希码： " + cat3.hashCode());
        System.out.println("猫咪1号是否与猫咪2号相同： " + cat1.equals(cat2));
        System.out.println("猫咪1号是否与猫咪3号相同： " + cat1.equals(cat3));
    }

    @Test
    public void testHashCode() throws Exception {
    }

}