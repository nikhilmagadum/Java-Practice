package OOPS.Inheritance;

class Test1 {
    int x, y;

    Test1() {
      //  super(); here also by default it will be there and again it will call  parent class constructor which is Object
        x = 100;
        y = 200;
        System.out.println("test1");
    }

    Test1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Test2 extends Test1 {
    int a, b;

    Test2() {
//        super();  by default it will be there created by the JVM .it will call parent class constructor
        a = 300;
        b = 400;
        System.out.println("test2");
    }

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println(x);
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
