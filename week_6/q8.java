package week6;

import java.util.*;

class q8 {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Hari");

        System.out.println("TreeSet: " + names);

        HashSet<String> set1 = new HashSet<>(Arrays.asList("Dog","Cat","Elephant","Lion"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Cat","Giraffe","Dog","Monkey"));

        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
        System.out.println("Difference: " + difference(set1, set2));
    }

    static Set<String> union(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    static Set<String> intersection(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    static Set<String> difference(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }
}