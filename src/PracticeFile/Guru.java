package PracticeFile;

public class Guru {

    public static void main(String[] args) {
        Shisya s = new Shisya();

        s.name = "nikhil";
        s.age = 18;
        System.out.println( s.name + " " + s.age);

        Shisya s1 = new Shisya("Surya" , 24);
    }
}
