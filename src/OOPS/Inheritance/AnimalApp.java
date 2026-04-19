package OOPS.Inheritance;

public class AnimalApp {
    static void main() {

    }
}
class Lion {

    String name;
    int size;

    void  roar () {
        System.out.println(name + "  is Roaring ");
        System.out.println("The size of the " + name  + "  is " + size + " inch");
    }
     void eat() {
         System.out.println(name + "  is Eating ");
     }
}
// extends is the Keyword used  to implement the inheritance 
class Tiger extends Lion {
    //  here in this the properties of the Lion class are inherited (Methods and variables )
}
class Deer extends Lion {
    // This is  again extracted the behaviours and properties from the Lion class through inheritance
}

