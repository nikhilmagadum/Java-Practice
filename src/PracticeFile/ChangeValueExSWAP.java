package PracticeFile;

import java.util.Arrays;

public class ChangeValueExSWAP {

    static void main(String[] args) {

        // create an Array // collection of numbers int or whatever
        int [] arr = {1,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }

    static  void change(int[] nums) {
        nums[0] =  99; // if you make the change in the object via this ref variable,same object will be changed
        System.out.println(nums[1]);
    }
}
