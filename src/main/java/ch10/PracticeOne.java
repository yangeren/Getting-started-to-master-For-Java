package ch10;

import java.util.ArrayList;

public class PracticeOne {
    private int plus;
    private ArrayList result = new ArrayList();

    public PracticeOne(int plus) {
        this.plus = plus;
        for (int i = 0; i < this.plus; i++) {
            result.add(i);
        }
        result.remove(10);

    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }

    public ArrayList getResult() {
        return result;
    }

    public void plusResult() {
        for (int i = 0; i < this.plus; i++) {
            this.result.add(i);
        }
        this.result.remove(10);
    }

    public static void main(String[] args) {
        PracticeOne practiceOne = new PracticeOne(100);
        System.out.println(practiceOne.getResult());
    }
}
