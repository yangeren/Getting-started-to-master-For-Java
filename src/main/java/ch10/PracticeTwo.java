package ch10;

import java.util.*;

public class PracticeTwo {

    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("a");
        set.add("c");
        set.add("C");
        set.add("a");
        System.out.println(set);

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("a");
        list.add("c");
        list.add("C");
        list.add("a");
        System.out.println(list);
    }
}
