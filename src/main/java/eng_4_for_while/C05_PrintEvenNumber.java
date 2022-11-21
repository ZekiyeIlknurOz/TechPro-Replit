package eng_4_for_while;

import java.util.Scanner;

public class C05_PrintEvenNumber {
    // Print even numbers from 20 to 0 but do not use decrement (i--).
    //OUTPUT  : Even Numbers from 20 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number1: ");
        int num1 = input.nextInt();
        System.out.print("Number2: ");
        int num2 = input.nextInt();
        int minNumber = Math.min(num1,num2);
        int maxNumber = Math.max(num1,num2);
        System.out.print("Even Numbers from " + maxNumber + " to " + minNumber + " are: ");
        printEven(maxNumber,minNumber);
        input.close();
    }

    public static void printEven(int x, int y){
        if (x==0){
            System.out.print(x);
        } else if (x%2==0 && x>=y){
            System.out.print(x + " ");
            printEven(x-2,y);
        } else if (x>y) {
            x--;
            printEven(x,y);
        }
    }
}
