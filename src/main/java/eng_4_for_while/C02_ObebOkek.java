package eng_4_for_while;

import java.util.Scanner;

public class C02_ObebOkek {

    public static void main(String[] args) {
        //  Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
        //Input : 30 and 40
        //  Expected OutPut:
        //  GCD for 30 and 40 = 10
        //  LCM for 30 and 40 = 120
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        int gcd = 0, lcm = 0;
        int min = Math.min(num1, num2);
        for (int i = 2; i < min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        lcm = num1*num2/gcd;
        System.out.println("GCD for " + num1 + " and " + num2 + " = " + gcd);
        System.out.println("LCM for " + num1 + " and " + num2 + " = " + lcm);

    }
}
