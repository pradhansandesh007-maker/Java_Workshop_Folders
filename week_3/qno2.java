package javaweek3;

public class qno2 {
    public static void main(String[] args) {
        float[] nums = {2.5f, 3.5f, 4.0f, 5.5f};

        float sum = 0;
        for (float n : nums) {
            sum += n;
        }

        float avg = sum / nums.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}