package ch11;

public class Example_01 {
    private int num = 10;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Example_01() throws ClassNotFoundException {
        Class.forName("com.mingrisoft.Test");
//        try {
//            Class.forName("com.mingrisoft.Test");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            e.getMessage();
//            e.getLocalizedMessage();
//            e.toString();
//        }
        System.out.println("测试。");
    }

    public static void main(String[] args) {
        try {

            Example_01 example_01 = new Example_01();
            example_01.setNum(888);
            System.out.println(example_01.getNum());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
