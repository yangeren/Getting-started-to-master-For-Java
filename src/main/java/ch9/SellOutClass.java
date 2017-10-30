package ch9;

public class SellOutClass {
    private String name;

    public SellOutClass() {
        name = "苹果";
    }

    public void sell(final int price) {
        class Apple {
            int innerPrice = 0;

            public Apple(int price) {
                innerPrice = price;
            }

            public void price() {
                System.out.println("现在开始销售" + name);
                System.out.println("单价为：" + innerPrice + "元");
            }


        }
        Apple apple = new Apple(price);
        apple.price();
    }

    public static void main(String[] args){
        SellOutClass sample = new SellOutClass();
        sample.sell(100);
    }
}
