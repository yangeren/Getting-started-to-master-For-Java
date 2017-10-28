package ch8;

public class Manager extends Employee {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return "子类：我是明日科技的经理。";
    }
}
