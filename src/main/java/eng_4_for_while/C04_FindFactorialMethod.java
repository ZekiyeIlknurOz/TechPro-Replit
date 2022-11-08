package eng_4_for_while;

import java.util.Scanner;

public class C04_FindFactorialMethod {

    public static void main(String[] args) {
        //  Write a return method that accepts an integer as input and calculates
        //  factorial and prints like output.
        //  Input : 6
        //  Output: 6!=6*5*4*3*2*1=720
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int num = input.nextInt();
        printFactorial(num);
        input.close();
    }

    public static void printFactorial(int a) {
        String s = a + "!=";
        int factorial = 1;
        for (int i = a; i > 0; i--) {
            if (i == 1) {
                s = s.concat(i + "");
            } else {
                s = s.concat(i + "*");
                factorial *= i;
            }
        }
        System.out.println(s + "=" + factorial);
    }
}
