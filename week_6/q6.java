package week6;

import java.util.*;

class q6 {
    public static void main(String[] args) {

        String str = "Hello World";
        Stack<String> stack = new Stack<>();

        String[] words = str.split(" ");

        for(String word : words) {
            stack.push(word);
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}