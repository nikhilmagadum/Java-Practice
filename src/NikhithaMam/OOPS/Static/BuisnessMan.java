package NikhithaMam.OOPS.Static;
import java.util.Scanner;

public class BuisnessMan {
    private float p;
    private float t;
    static private float r ;
    private float si;

    static {
        r =  15.2f;
    }


   public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle : ");
        p = sc.nextFloat();
        System.out.println("Enter  the tenure: ");
        t = sc.nextFloat();

    }

    public void calcInterest() {
        si = (p * t * r) / 100;
    }

    public  void  disp() {
        System.out.println("SI : " + si);
    }

}

class Day18 {
    static void main(String[] args) {
        BuisnessMan b1 = new BuisnessMan();
        b1.acceptInput();
        b1.calcInterest();
        b1.disp();

        BuisnessMan b2 = new BuisnessMan();
        b2.acceptInput();
        b2.calcInterest();
        b2.disp();

        BuisnessMan b3 = new BuisnessMan();
        b3.acceptInput();
        b3.calcInterest();
        b3.disp();

    }
}

