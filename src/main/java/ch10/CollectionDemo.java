package ch10;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        String a = "A", b = "B", c = "C", d = "D", e = "E";
        List<String> list = new LinkedList<String>();
        list.add(a);
        list.add(e);
        list.add(d);
        Iterator<String> fristlterator = list.iterator();

        System.out.println("修改前的集合中的元素是：");
        while (fristlterator.hasNext()) {
            System.out.println(fristlterator.next() + " ");
        }
        list.set(1, b);
        list.set(2, c);
        Iterator<String> it = list.iterator();
        System.out.println();
        System.out.println("修改后集全中的元素是：");
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }


        Set<String> set = new HashSet<String>();
        set.addAll(list);
        Iterator<String> it1 = set.iterator();
        System.out.println("集合中的元素是： ");
        while (it1.hasNext()) {
            System.out.println(it1.next() + " ");
        }


    }
}
