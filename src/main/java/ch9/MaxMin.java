package ch9;

import java.util.Random;

public class MaxMin {
    public static class Result {
        private float max;
        private float min;

        public Result(float max, float min) {
            this.max = max;
            this.min = min;
        }

        public float getMax() {
            return max;
        }

        public void setMax(float max) {
            this.max = max;
        }

        public float getMin() {
            return min;
        }

        public void setMin(float min) {
            this.min = min;
        }
    }

    public static Result getResult(float[] array) {
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        for (float i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return new Result(max, min);
    }


    public static void main(String[] args) {
        float[] array = new float[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random(10*i).nextFloat();
        }
        System.out.println("源数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("最大值： " + MaxMin.getResult(array).getMax());
        System.out.println("最小值： " + MaxMin.getResult(array).getMin());
    }
}
