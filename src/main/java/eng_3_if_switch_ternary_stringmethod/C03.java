package eng_3_if_switch_ternary_stringmethod;

import java.util.Scanner;

public class C03 {
    /*  Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
    Ithe sum have more thf given integers or an 10 digits, print "overflow".
    EXAMPLE:
    INPUT      :  Input two integers:
    25
    46
    OUTPUT :    Sum of the numbers: 71              */

    public static byte findDigitNumber(long x) {
        byte digitNumber = 0;
        while (x != 0) {
            x /= 10;
            digitNumber++;
        }
        return digitNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Number : ");
        long num1 = input.nextLong();
        System.out.print("Second Number : ");
        long num2 = input.nextLong();
        long sum = num1 + num2;
        String s = "";
        s = findDigitNumber(sum) > 10 ? ("OverFlow") : ("Sum of the numbers: " + sum);
        System.out.println(s);
        input.close();
    }
}
