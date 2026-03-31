package week4;

class Animal {
    String name;

    // Constructor with parameter
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {

    // Dog constructor using super
    Dog(String name) {
        super(name); // calling Animal constructor
        System.out.println("Dog constructor called");
    }

    void display() {
        System.out.println("Dog name is: " + name);
    }
}

public class qno3 {
    public static void main(String[] args) {

        // Creating object of Dog
        Dog d1 = new Dog("Rocky");
        d1.display();

        System.out.println();

        Dog d2 = new Dog("Tommy");
        d2.display();
    }
}