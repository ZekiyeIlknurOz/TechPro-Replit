package eng_6_list;

import java.util.Scanner;

public class C03_InvertArray_Method {
    //  Get a sentence from the user. Accept the sentence received from the user as a parameter,
    //  Invert sentence using Array and write a Method that returns the result as a String
    //  to the main method.
    //  Note: Upper and lower case letters, spaces and special characters will not be changed.
    //Input :   It is very nice to write code.
    //Output :  .edoc etirw ot ecin yrev si tI
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String str = input.nextLine().trim();
        String invertStr = invert(str);
        System.out.println(invertStr);
        input.close();
    }

    public static String invert(String str){
        String arr[] = str.split("");
        String invertArr[] = new String[arr.length];
        String s = "";
        for (int i = 0;i< arr.length;i++){
            invertArr[i] = arr[arr.length-1-i];
            s = s.concat(arr[arr.length-1-i]);
        }
        return s;
    }
}
