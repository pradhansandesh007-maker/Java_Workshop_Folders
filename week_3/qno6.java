package javaweek3;

public class qno6 {
    boolean isOn;

    qno6() {
        isOn = false;
    }

    void turnOn() {
        isOn = true;
        System.out.println("Lamp is ON: " + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Lamp is Off: " + isOn);
    }

    public static void main(String[] args) {
        qno6 lamp1 = new qno6();
        lamp1.turnOn();
        lamp1.turnOff();
    }
}