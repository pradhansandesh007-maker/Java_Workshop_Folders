package javaweek5;

class qno9 implements qno8 {
    public void specialFeature() {
        System.out.println("Fish can swim");
    }

    public static void main(String[] args) {
        qno9 obj = new qno9();
        obj.specialFeature();
    }
}