package eng_6_list;

import java.util.Arrays;
import java.util.Scanner;

public class C07_RemoveSpecificElementsArray {

    public static void main(String[] args) {
        //  write a Java program to removes a specific element from an array and
        //  put the remaining elements in a new array and prints the new array
        //  Input :{1,2,3,4,5,6}
        //  element:6     Output : [1,2,3,4,5]
        String arr[] = {"1", "2", "3", "4", "5", "6"};
        String newArr[] = new String[arr.length - 1];
        Scanner input = new Scanner(System.in);
        System.out.print("Elements: ");
        String str = input.next().substring(0, 1);
        for (int i = 0,j=0; i < arr.length; i++) {
            if (!arr[i].equals(str)) {
                newArr[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));


    }
}
