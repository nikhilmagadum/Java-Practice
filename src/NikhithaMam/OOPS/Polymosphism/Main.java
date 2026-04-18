package NikhithaMam.OOPS.Polymosphism;

class Plane {
    void takeOff() {
        System.out.println("Plane is taking off");
    }
    void fly() {
        System.out.println("Plane is flying");
    }
    void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Cargo plane fly at low height");
    }
}

class PassengerPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Passenger plane fly at medium height");
    }
}

class FighterPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Fighter plane fly at high hight");
    }
}

public class Main {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();

        Plane p;
        p = cp;
        p.takeOff();

        p.fly();
        p.land();
        System.out.println("1----------");

        PassengerPlane pp = new PassengerPlane();
        p = pp;
        p.takeOff();
        p.fly();
        p.land();
        System.out.println("2----------");

        FighterPlane fp = new FighterPlane();
        p = fp;
        p.takeOff();
        p.fly();
        p.land();
    }
}

