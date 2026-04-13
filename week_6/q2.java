package week6;

import java.util.*;

class q2 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Is Empty? " + list.isEmpty());

        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);

        System.out.println("LinkedList: " + list);
    }
}