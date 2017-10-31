package ch10;

import java.util.HashMap;
import java.util.Map;

public class PracticeThree {
    private int id;


    public PracticeThree(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        HashMap<Integer, PracticeThree> hashMap = new HashMap<Integer, PracticeThree>();
        PracticeThree Emp = new PracticeThree(001);
        PracticeThree Emp1 = new PracticeThree(002);
        PracticeThree Emp2 = new PracticeThree(003);
        PracticeThree Emp3 = new PracticeThree(004);
        PracticeThree Emp4 = new PracticeThree(005);
        hashMap.put(Emp.getId(), Emp);
        hashMap.put(Emp1.getId(), Emp1);
        hashMap.put(Emp2.getId(), Emp2);
        hashMap.put(Emp3.getId(), Emp3);
        hashMap.put(Emp4.getId(), Emp4);
        System.out.println(hashMap);
        hashMap.remove(005);
        System.out.println(hashMap);
    }

}
