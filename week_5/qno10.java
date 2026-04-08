package javaweek5;

class qno10 implements qno8 {
    public void specialFeature() {
        System.out.println("Bird can fly");
    }

    public static void main(String[] args) {
        qno10 obj = new qno10();
        obj.specialFeature();
    }
}
