package eng_8_stringbuilders;

import java.util.Scanner;

public class C01_ReverseSentence {
    // 	 Write a java program which accept a sentence as parameter, than reverses sentence
    // 	 by using StringBuilder and checks if sentence is palindrome or not
    //   (without case sensitivity)
    //   Eg : input : I love Java
    //   Output: "Reversed sentence : avaJ evol I .     It is not a palindrome"
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().trim();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        if (!sb.toString().equalsIgnoreCase(str)){
            System.out.println("It is not a palindrome\"");
        } else {
            System.out.println("It is Palindrome");
        }
    }
}
