package ch9;

public class PracticeOne {

    public static class Result {
        int max;

//        public Result(int max) {
//            this.max = max;
//        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            for (int i = 0; i < max; i++) {
                this.max += i;
            }
        }

        public static int getResult(int max) {
            for (int i = 0;i < max; i++) {
                max += i;
            }
            return max;
        }
    }

//    public static Result getResult(int i) {
//
//    }

    public static void main(String[] args) {

        Result result = new Result();
        result.setMax(10);
        System.out.println(result.getMax());
    }

}
