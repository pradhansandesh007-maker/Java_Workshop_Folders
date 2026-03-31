package week4;

final class FinalClass {
}

// class Test extends FinalClass {} ❌ error

class A {
    final void display() {
        System.out.println("Final method");
    }
}

class B extends A {
    // void display() {} ❌ cannot override
}

public class qno6 {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}