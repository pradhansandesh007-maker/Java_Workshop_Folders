package week6;

import java.util.*;

class q10 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 2, 9, 1));

        Collections.sort(nums);
        System.out.println("Ascending: " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Descending: " + nums);

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green"));

        Collections.sort(colors);
        System.out.println("Sorted Colors: " + colors);

        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Reverse Colors: " + colors);

        Collections.sort(nums);
        int index = Collections.binarySearch(nums, 5);
        System.out.println("Index of 5: " + index);
    }
}