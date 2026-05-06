package week8;

import java.io.*;
import java.util.*;


public class qno7 {

    public static void main(String[] args) {
        String csvFile = "students.csv";
        createSampleCSV(csvFile);

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String headerLine = br.readLine();
            if (headerLine == null) {
                System.err.println("CSV file is empty.");
                return;
            }
            String[] headers = headerLine.split(",");
            for (int i = 0; i < headers.length; i++) {
                headers[i] = headers[i].trim();
            }
            List<List<String>> columns = new ArrayList<>();
            for (String ignored : headers) {
                columns.add(new ArrayList<>());
            }

            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                String[] values = splitCSVLine(line);
                for (int i = 0; i < headers.length && i < values.length; i++) {
                    columns.get(i).add(values[i].trim().replace("\"", ""));
                }
            }

            for (int i = 0; i < headers.length; i++) {
                String fileName = headers[i].toUpperCase().replace(" ", "_") + ".txt";
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
                    for (String value : columns.get(i)) {
                        bw.write(value);
                        bw.newLine();
                    }
                }
                System.out.println("Created: " + fileName + " -> " + columns.get(i));
            }
            System.out.println("\nAll column files created successfully.");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static String[] splitCSVLine(String line) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        boolean inQuotes = false;

        for (char c : line.toCharArray()) {
            if (c == '"') {
                inQuotes = !inQuotes;
            } else if (c == ',' && !inQuotes) {
                result.add(current.toString());
                current.setLength(0);
            } else {
                current.append(c);
            }
        }
        result.add(current.toString());
        return result.toArray(new String[0]);
    }

    private static void createSampleCSV(String path) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
            pw.println("FIRST_NAME,LAST_NAME,ADDRESS,CONTACT_NUMBER,SEMESTER");
            pw.println("John,Doe,\"123 Main St, Anytown USA\",555-1234,Fall 2023");
            pw.println("Jane,Smith,\"456 Oak Rd, Somecity NY\",555-5678,Spring 2024");
            pw.println("Michael,Johnson,\"789 Elm Blvd, Othertown CA\",555-9012,Summer 2023");
            pw.println("Emily,Williams,\"321 Maple Ave, Somewhere FL\",555-3456,Fall 2024");
            pw.println("David,Brown,\"654 Pine St, Anycity TX\",555-7890,Spring 2023");
        } catch (IOException e) {
            System.err.println("Could not create sample CSV: " + e.getMessage());
        }
    }
}