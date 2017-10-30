package ch9;

import java.lang.reflect.Method;
import java.lang.reflect.*;

public class MoreMethod {
    static void staticMethod() {
        System.out.println("执行staticMethod()方法");
    }

    public int publicMethod(int i) {
        System.out.println("执行publicMethod()方法");
        return i * 100;
    }

    protected int protectedMethod(String s, int i) throws NumberFormatException {
        System.out.println("执行protectedMethod()方法");
        return Integer.valueOf(s) + i;
    }

    private String privateMethod(String...strings) {
        System.out.println("执行privateMethod()方法");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i < strings.length; i++) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MoreMethod moreMethod = new MoreMethod();
        moreMethod.protectedMethod("4",1);

        Class c = moreMethod.getClass();

        Method[] m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++) {
            System.out.println("method = " + m[i].toString());
        }

    }

}
