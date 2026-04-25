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

    @Override
    void fly() {
        System.out.println("CargoPlane is flying at Lower Height...");
    }

    void carryCargo() {
        System.out.println("CargoPlane is carrying cargo...");
    }
}

class PassengerPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Passenger is flying at Medium Height...");
    }

    void carryPassenger() {
        System.out.println("Passenger Plane is carrying passengers....");
    }
}

class FighterPlane extends Plane {
    @Override
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


/*
what Learnt today is
types  of methods in inheritance :
They are Inherited methods--These are the one which will be inherited from other class
,Overridden methods -- these are the one which same method name as inherited method but used with @Override,
specilizend methods-- are basically new methods which you create in a class

Annotations : Gives you some Data about methods.

Defination : Annotations in Java are a form of metadata that provide additional information about the program.
 They do not change the action of a compiled program but can be used by the compiler or runtime for processing.
 */
