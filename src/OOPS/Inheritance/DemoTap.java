package OOPS.Inheritance;


class Demo  extends Object{
    int x;
    int y;


    void fun() {
        System.out.println("fun1");
    }
}

class Demo2 extends Demo {

}


public class DemoTap {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        System.out.println(d2.x);
        System.out.println(d2.y);
        d2.fun();
    }
}