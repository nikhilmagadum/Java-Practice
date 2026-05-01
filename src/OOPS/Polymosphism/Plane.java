package OOPS.Polymosphism;
//Polymorphism Topic

public class Plane {

    public void fly() {
        System.out.println("Plane is flying...");
    }
}

class CargoPlane extends Plane {
    @Override // it is called as annotations --> it is understamnding for the compiler that this method is Overridden
    public void fly() {
        System.out.println("Cargo Plane is flying at a lower height...");
    }
}

class PassengerPlane extends Plane {
    @Override // when we Override we cannot change the method name and parameter but we  can change the modifier
    //  the visability should always be in the increasing order
    public void fly() {
        System.out.println("Passenger Plane is flying at Greater height...");
    }

}

class FighterPlane extends Plane {
    @Override
    public void fly() {
        System.out.println("Fighter Plane is flying with carrying weapons...");
    }
}

class Poly {
    public static void main(String[] args) {

        Plane ref = null ;  // nullpoiniter exception error will come

//        if both object type and refernce type are same means then it is called as tight coupling
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new  PassengerPlane();
        FighterPlane fp = new FighterPlane();

//        Plane cp = new CargoPlane();
//        Plane pp = new  PassengerPlane();
//        Plane fp = new FighterPlane();

        //if Both are different then it is called as Loose Coupling in Java
        // Note : Whenever you do loose coupling the ref type should be a prent type and object type should be child type

        ref = cp;
        ref.fly();

        ref = pp;
        ref.fly();

        ref = fp;
        ref.fly();
//        cp.fly();
//        pp.fly();
//        fp.fly();
    }

}


