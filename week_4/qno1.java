package week4;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void show() {
        System.out.println("Dog name: " + name);
    }
}

public class qno1 {
    public static void main(String[] args) {
        Dog d = new Dog("Rocky");
        d.show();
    }
}