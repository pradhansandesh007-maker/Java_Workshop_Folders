package week4;

class Parent {
    private int a = 10;
    protected int b = 20;
    public int c = 30;
}

class Child extends Parent {
    void show() {
        // System.out.println(a); ❌ not accessible
        System.out.println(b);
        System.out.println(c);
    }
}

public class qno5 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}