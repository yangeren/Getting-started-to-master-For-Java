package ch10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PeopleDemo {
    public static void main(String[] args) {
        Set<People> hashSet = new HashSet<People>();
        hashSet.add(new People("陈同学", 201111));
        hashSet.add(new People("王同学", 201112));
        hashSet.add(new People("李同学", 201113));
        Iterator<People> iterator = hashSet.iterator();
        System.out.println("集合中的元素是：");
        while (iterator.hasNext()){
            People people = iterator.next();
            System.out.println(people.getName() + people.getId_card());
        }
    }
}
