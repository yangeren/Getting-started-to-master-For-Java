package ch10;

import java.util.*;

public class MapText {
    public static void main(String[] args) {
        Map map = new HashMap();
        Emp emp = new Emp("0012", "王一");
        Emp emp1 = new Emp("0021", "张三");
        Emp emp2 = new Emp("0033", "李四");
        map.put(emp2.getE_id(), emp2.getE_name());
        map.put(emp1.getE_id(), emp1.getE_name());
        map.put(emp.getE_id(), emp.getE_name());

        Set set = map.keySet();
        System.out.println(set);
        Iterator iterator = set.iterator();
        System.out.println("HashMap 类实现的Map集合，无序：");
        while (iterator.hasNext()){
            String str = (String) (iterator.next());
            String name = (String) map.get(str);
            System.out.println(str + " " + name);
        }

        System.out.println("-------------");

        TreeMap treeMap = new TreeMap();
        treeMap.putAll(map);
        Iterator iterator1 = treeMap.keySet().iterator();
        System.out.println("TreeMap类实现的Map集合，键对象升序：");
        while (iterator1.hasNext()){
            String str1 = (String) iterator1.next();
            String name = (String) map.get(str1);
            System.out.println(str1 + " " + name);
        }
    }
}
