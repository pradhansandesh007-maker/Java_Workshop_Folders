package week8;

import java.io.*;


public class qno1 {

    public static void main(String[] args) {
        createSampleFile();

        String sourcePath = "one.txt";
        String destPath   = "two.txt";

        try (
            BufferedInputStream  bis = new BufferedInputStream(new FileInputStream(sourcePath));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully from " + sourcePath + " to " + destPath);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }

    private static void createSampleFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("one.txt"))) {
            pw.println("Hello from one.txt!");
            pw.println("This content will be copied to two.txt.");
            pw.println("BufferedInputStream and BufferedOutputStream in action.");
        } catch (IOException e) {
            System.err.println("Could not create one.txt: " + e.getMessage());
        }
    }
}