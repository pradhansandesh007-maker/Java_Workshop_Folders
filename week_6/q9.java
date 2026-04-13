package week6;

import java.util.*;

class q9 {
    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Ram", "12345");
        contacts.put("Shyam", "67890");

        System.out.println("Contacts: " + contacts);

        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("Nepal", "Kathmandu");
        countryCapitals.put("India", "Delhi");
        countryCapitals.put("USA", "Washington");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("UK", "London");

        printMap(countryCapitals);

        System.out.println("Capital of Nepal: " + getCapital(countryCapitals, "Nepal"));
        System.out.println("Contains Tokyo? " + containsCapital(countryCapitals, "Tokyo"));
    }

    static void printMap(HashMap<String, String> map) {
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    static String getCapital(HashMap<String, String> map, String country) {
        return map.get(country);
    }

    static boolean containsCapital(HashMap<String, String> map, String capital) {
        return map.containsValue(capital);
    }
}