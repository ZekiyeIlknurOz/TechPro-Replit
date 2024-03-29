package eng_6_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_PrintFirst10PrimeNumber {
    //  Write a program that accepts an integer as input and prints
    //  first 10 prime numbers greater than input
    //  Check numbers if they are even or not in a return method.
    //  Input : 5
    //  Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        checkPrime(number);
        input.close();
    }

    public static void checkPrime(int number) {
        List<Integer> list = new ArrayList<>();
        int temp = number;
        while (list.size() < 10) {
            int count = 0;
            if (number <= 1) {
                number = 2;
                list.add(number);
                number++;
            } else if (number % 2 == 0) {
                number++;
            } else {
               if (number!=temp){
                   for (int i = 2; i < number; i++) {
                       if (number % i == 0) {
                           count++;
                       }
                   }
                   if (count == 0) {
                       list.add(number);
                   }
               }
                number++;
            }
        }
        System.out.println(list);
    }
}
