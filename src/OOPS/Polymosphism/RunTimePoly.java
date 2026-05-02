package OOPS.Polymosphism;

class Computer {
    public void computer() {
        System.out.println("I am a computer");
    }
}

class Laptop extends Computer {
    public void computer() {
        System.out.println("I am Laptop..");
    }

}

public class RunTimePoly {
    public static void main (String[] args) {
        Computer c = new Laptop();
        c.computer();
    }
}
