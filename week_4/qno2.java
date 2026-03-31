package week4;

class Shape {
    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    double getArea() {
        return Math.PI * r * r;
    }
}

public class qno2 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println(c.getPerimeter());
        System.out.println(c.getArea());
    }
}