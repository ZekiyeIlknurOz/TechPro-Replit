package eng_5_method_arrays;

import java.util.Arrays;

public class C06_PrintMinMaxNumberIntArray_Method {
    //  Write a method that accepts an integer array as input and
    //  prints the minimum and the maximum numbers from given array
    //  Input : {3,2,5,4,1,6}     Output :   min: 1   , max: 6
    public static void main(String[] args) {
        int arr[] = {3,2,5,4,1,6};
        printMinMax(arr);
    }

    public static void printMinMax(int[] arr){
        Arrays.sort(arr);
        int minNumber = arr[0];
        int maxNumber = arr[arr.length-1];
        System.out.println("min: " + minNumber);
        System.out.println("max: " + maxNumber);
    }
}
