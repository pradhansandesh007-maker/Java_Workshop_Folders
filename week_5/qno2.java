package javaweek5;

class qno2 extends qno1 {
    int length = 10;
    int breadth = 5;

    void calculateArea() {
        System.out.println("Area: " + (length * breadth));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }

    public static void main(String[] args) {
        qno2 obj = new qno2();
        obj.calculateArea();
        obj.calculatePerimeter();
    }
}