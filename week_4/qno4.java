package week4;

class Person {
    protected String address;
}

class Employee extends Person {
    String dept;

    void setData() {
        address = "Kathmandu";
        dept = "IT";
    }

    void display() {
        System.out.println(address + " " + dept);
    }
}

public class qno4 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setData();
        e.display();
    }
}