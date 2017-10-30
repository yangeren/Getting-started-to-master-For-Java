package ch9;

import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

public class ClassDeclarationViewer {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        System.out.println("类的标准名称：" + clazz.getCanonicalName());
        System.out.println("类的修饰符：" + Modifier.toString(clazz.getModifiers()));
        TypeVariable<?>[] typeVariables = clazz.getTypeParameters();
        System.out.println("类的泛型参数：");
        if (typeVariables.length != 0) {
            for (TypeVariable<?> typeVariable: typeVariables) {
                System.out.println(typeVariable + "\t");
            }
        }
    }
}
