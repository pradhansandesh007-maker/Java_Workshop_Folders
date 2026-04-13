package week6;

import java.util.*;

class q4 {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Print
        for(String c : colors) {
            System.out.println(c);
        }

        // Check "Red"
        System.out.println("Contains Red? " + colors.contains("Red"));

        // Shuffle
        Collections.shuffle(colors);
        System.out.println("Shuffled: " + colors);

        // Sort
        Collections.sort(colors);
        System.out.println("Sorted: " + colors);
    }
}