package PracticeFile;

import java.util.Arrays;

public class Varagrs {

    static void main(String[] args) {
        vars(2,3,5,62,67,2,7,7,8,8,8,8,62,5,73);
    }

    static  void vars(int ...v) {
        System.out.println(Arrays.toString(v));
    }

}
