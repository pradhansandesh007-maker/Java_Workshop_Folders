package javaweek3;

public class qno9 {
    double width, height, depth;

    qno9() {
        width = 10;
        height = 12;
        depth = 8;
    }

    qno9(double length) {
        width = length;
        height = length;
        depth = length;
    }

    qno9(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    void getVolume() {
        double volume = width * height * depth;
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {

        qno9 box1 = new qno9();
        qno9 cube = new qno9(5);
        qno9 cuboid = new qno9(4, 6, 8);

        box1.getVolume();
        cube.getVolume();
        cuboid.getVolume();
    }
}