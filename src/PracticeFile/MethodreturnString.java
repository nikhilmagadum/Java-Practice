package PracticeFile;

public class MethodreturnString {

    static  String greeting() {
        System.out.println("This is an return type as String which i m practcing now.");
        String MSG = "hello Nikhil you are doing Good Learing Java!.";
        return MSG;


    }

    static void main(String[] args) {

        //greeting();
        String message  = greeting();
        System.out.println(message);
    }
}
