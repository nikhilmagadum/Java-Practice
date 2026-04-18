package NikhithaMam.OOPS.Interface;
interface  Calculater {
    void sub();
    void add();
}

class   Calculater2  {

    void mul(){
        System.out.println("Multiplication");
    }

    void div(){
        System.out.println("Division");
    }
}

class Mycalculator extends Calculater2 implements Calculater{

     ///  First shoul use Extends and thn use implements
     /// // A class can extends and also implements  another interface at the  same type

     /// // We can have empty interface i.e called as Marker interface or Tagged interface
    @Override
    public void add() {
        System.out.println("Addition");
    }

    @Override
    public void sub() {
        System.out.println("Subtraction");
    }
}

public class Main {

    static void main() {
             Mycalculator calc = new Mycalculator();
             calc.sub();
             calc.mul();
             calc.div();
             calc.add();
    }
}
