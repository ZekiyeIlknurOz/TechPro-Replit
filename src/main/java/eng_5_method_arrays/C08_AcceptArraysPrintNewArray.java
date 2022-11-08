package eng_5_method_arrays;

import java.util.Arrays;

public class C08_AcceptArraysPrintNewArray {

    public static void main(String[] args) {
        //  Write a return method that accepts 2 integer Arrays as parameters And
        //  adds 2 array into a new Array and prints it.
        //Input1={1,2,3,4}      Input2={5,6}        Output={1,2,3,4,5,6}
        int input1[] = {1, 2, 3, 4};
        int input2[] = {5, 6};
        int arr[] = newArray(input1, input2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] newArray(int[] arr, int[] brr) {
        int length = arr.length + brr.length;
        int[] addArray = new int[length];
        for (int i = 0; i < length; i++) {
            if (i < arr.length) {
                addArray[i] = arr[i];
            } else {
                for (int j = arr.length, k = 0; j < length; j++, k++) {
                    addArray[j] = brr[k];
                }
            }
        }
        return addArray;
    }
}
