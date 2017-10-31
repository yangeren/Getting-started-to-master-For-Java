package ch10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        Collections.addAll(arrayList, 1, 2, 3, 4, 5,6);
//        System.out.println("集合中的元素：" + arrayList);
//        ListIterator<Integer> iterator = arrayList.listIterator();
//        boolean hasNext = iterator.hasNext();
//        System.out.println("集合是否具有下一个元素：" + hasNext);
//        boolean hasPrevious = iterator.hasPrevious();
//        System.out.println("集合是否具有前一个元素：" + hasPrevious);
//        int next = iterator.next();


        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            list.add(i);
        }

        System.out.println("列表中的全部元素：" + list);
        System.out.println("逆序输出列表中的元素： ");

        ListIterator<Integer> listIterator = list.listIterator();
        for (listIterator = list.listIterator(); listIterator.hasNext();) {
            listIterator.next();
        }
        for (; listIterator.hasPrevious();){
            System.out.println(listIterator.previous() + " ");
        }
    }
}
