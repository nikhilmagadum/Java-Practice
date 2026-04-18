package PracticeFile;

public class OOP1 {

        static void main(String[] args) {

            Car c1 = new Car();
//            c1.name = "BMW";
//            c1.cost = 67.8f;
//            c1.milage = 24.5f;

            c1.start();
            c1.accelerate();
            c1.stop();
            System.out.println(c1.name);
            System.out.println(c1.cost);
            System.out.println(c1.milage);

        }
    }

