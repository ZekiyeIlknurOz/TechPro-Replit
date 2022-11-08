package eng_6_list;

import java.util.Scanner;

public class C08_ReverseStringBuilder_Palindrome {

    public static void main(String[] args) {
        // Write a java program which accept a sentence as parameter, than reverses sentence
        // by using StringBuilder and checks if sentence is palindrome or not
        // (without case sensitivity).Use StringBuilder.
        //Input :       I love Java.
        //Output:       Reversed sentence : avaJ evol I.
        //              It is not a palindrome"
        Scanner input = new Scanner(System.in);
        System.out.print("Sentence: ");
        String str = input.nextLine();
        str = str.replace(".","");
        String reverseStr = check(str);
        if (str.equals(reverseStr)) {
            System.out.print(".\nIt is Palindrome.");
        } else {
            System.out.print(".\nIt is not a Palindrome\"");
        }
    }

    public static String check(String str) {
        StringBuilder sb = new StringBuilder(str);
        String s = sb.reverse().toString();
        System.out.print(s);
        return s;
    }
}
