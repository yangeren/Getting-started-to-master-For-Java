package ch10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            list.add(i);
        }

        System.out.println("列表中的全部元素：");
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next()+ " ");
        }
    }
}
