package eng_3_if_switch_ternary_stringmethod;

import java.util.Scanner;

public class C06 {

    public static void main(String[] args) {
        // Ask user to type a name, the length of name should be 3.
        //Then check if the name has same characters.
        //If the String has same characters Print “String has duplicate characters”
        //Else Print “String has unique characters”
        //Please use ternary.
        //Input :ala
        //OutPut:String has duplicate characters
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.next().toLowerCase();
        boolean isThereSameChar = false;
        for (int i = 0; i < name.length(); i++) {
            String c = name.substring(i, i + 1);
            if (name.indexOf(c) != name.lastIndexOf(c)) {
                isThereSameChar = true;
                break;
            }
        }
        String s = isThereSameChar ? "String has duplicate characters" : "String has unique characters";
        System.out.println(s);

    }
}
