package tr_2_scanner;

import java.util.Scanner;

public class Scanner_1 {

    public static void main(String[] args) {
        //  Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        System.out.println(Math.pow(sayi,3)/2);

    }
}
