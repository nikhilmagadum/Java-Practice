package PracticeFile;

public class Shadowing {

    static  int x =  90;  // this will be  shadowed  at line no 8
    static void main(String[] args) {
        System.out.println(x); // 90
        int x =  40;
        System.out.println(x); //  40
        fun();
        nofun();
    }

    static  void fun() {
        System.out.println(x); // 90

//        int x =  50 ;
//        System.out.println(x);  // 50'
    }
    static  void nofun() {
        System.out.println(x);

        int x =  34567; // this is the latest value which inside this scope will be printed in the next line if print now]
        System.out.println(x);
    }

}
