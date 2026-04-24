package OOPS.Inheritance;

class Test1 extends Object{
    int x, y;

    Test1() {
      //  super(); here also by default it will be there and again it will call  parent class constructor which is Object
        x = 100;
        y = 200;
        System.out.println("test 1");
    }

    Test1(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("test 1.2");
    }
}

class Test2 extends Test1 {
    int a, b ;
    int x;


    Test2() {
        this(9,99);
//        super();  by default it will be there created by the JVM .it will call parent class constructor
        a = 300;
        b = 400;
        System.out.println("test 2");
    }

    Test2(int a, int b) {
        /*
 super();  Again here when parameterized constructor is called super(); will  be there here where it will call the default constructor using super();
        super(30,50);   to give values to parametrerized you have to give parameters to super(); here
*/
//        super(a,b);

        this.a = a;
        this.b = b;
        System.out.println("test 2.2");
    }

    void disp() {

        int x = 999;  // Local variable can be created with same name no issues here
        // SO the preference will be given to the local variable
        System.out.println("x (local) : " + x);
        System.out.println("Child class : " + this.x);
        System.out.println("parent class : "  + super.x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.disp();
    }

}
