package OOPS.Inheritance;

class Plane {

    void takeOff() {
        System.out.println("Plane is taking off...");
    }

    void fly() {
        System.out.println("plane is flyiing...");
    }

    void land() {
        System.out.println("Plane is landing...");
    }
}

class CargoPlane extends Plane {

    void fly() {
        System.out.println("CargoPlane is flying at Lower Height...");
    }

    void carryCargo() {
        System.out.println("CargoPlane is carrying cargo...");
    }
}

class PassengerPlane extends Plane {

    void fly() {
        System.out.println("Passenger is flying at Medium Height...");
    }

    void carryPassenger(){
        System.out.println("Passenger Plane is carrying passengers....");
    }
}

class FighterPlane extends Plane {

    void fly() {
        System.out.println("Fighter Plane  is flying at Greater  Height...");
    }

    void carryWeapons() {
        System.out.println("Fighter Plane is carrying weapons..");
    }

}


public class MethodsInheritance {
    public static void main(String[] args) {
//        CargoPlane cp = new CargoPlane();
//        cp.takeOff();
//        cp.fly();
//        cp.land();
//        cp.carryCargo();

//        PassengerPlane pp = new PassengerPlane();
//        pp.takeOff();
//        pp.fly();
//        pp.land();
//        pp.carryPassenger();

//        FighterPlane fp = new FighterPlane();
//        fp.takeOff();
//        fp.fly();
//        fp.land();
//        fp.carryWeapons();
    }
}
