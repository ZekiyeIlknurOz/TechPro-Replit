package eng_3_if_switch_ternary_stringmethod;

import java.util.Scanner;

public class C08 {
    //  Ask user for a string and print a new string made of 3 copies of the last 2 letters
    //  The strings length will be at least 2.
    //  INPUT       : Mustafa
    //  OUTPUT      : fafafa
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String str = input.next();
        int strLen = str.length();
        if (strLen>1){
            String c = str.substring(strLen-2);
            System.out.print(c.repeat(3));
        }
        input.close();
    }
}
