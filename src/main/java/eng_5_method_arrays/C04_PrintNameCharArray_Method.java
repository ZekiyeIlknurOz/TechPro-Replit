package eng_5_method_arrays;

import java.util.Arrays;

public class C04_PrintNameCharArray_Method {
    //  Create a method accepts a name as parameter and prints the name as a char array.
    //  (do not use toCharArray() method)       Input : John      /Output :[J, o, h, n]
    public static void main(String[] args) {
        String name = "John";
        printCharArray(name);
    }

    public static void printCharArray(String name) {
        String str[] = name.split("");
        System.out.println(Arrays.toString(str));
    }
}
