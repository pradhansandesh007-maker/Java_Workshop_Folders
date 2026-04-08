package javaweek5;

class qno14 {
    public static void main(String[] args) {
        try {
            display();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }

    static void display() throws ArrayIndexOutOfBoundsException {
        int[] age = {10,20,25,24,28,27,30,31,32};
        System.out.println(age[9]);
    }
}