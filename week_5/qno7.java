package javaweek5;

class qno7 implements qno5, qno6 {
    public void eat() {
        System.out.println("Cow eats grass");
    }

    public void walk() {
        System.out.println("Cow walks on 4 legs");
    }

    public void display() {
        System.out.println("This is a Cow");
    }

    public static void main(String[] args) {
        qno7 obj = new qno7();
        obj.eat();
        obj.walk();
        obj.display();
    }
}