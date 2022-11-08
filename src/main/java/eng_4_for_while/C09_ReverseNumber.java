package eng_4_for_while;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C09_ReverseNumber {

    public static void main(String[] args) {
        //  Write a java program to reverse the number which user entered.
        //  Input  :1238 -- Output :Reverse Of The Number: 8321
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi: ");
        int number = input.nextInt();
        int tempNumber = number;
        int length = 0;
        while (tempNumber != 0) {
            length++;
            tempNumber /= 10;
        }
        String s = "";
        for (int i = 0; i < length; i++) {
            int digit = number %10;
            s = s.concat(String.valueOf(digit));
            number /=10;
        }
        System.out.println(s);
        // 2.yol
        input = new Scanner(System.in);
        System.out.print("Sayi: ");
        String str = input.next();
        String arr[] = str.split("");
        Collections.reverse(Arrays.asList(arr));
        for (String w : arr){
            System.out.print(w);
        }

    }
}
