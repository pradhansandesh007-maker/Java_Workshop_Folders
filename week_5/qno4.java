package javaweek5;

class qno4 extends qno3 {
    void wheel() {
        System.out.println("Bus has 6 wheels");
    }

    public static void main(String[] args) {
        qno4 obj = new qno4();
        obj.wheel();
        obj.door();
    }
}