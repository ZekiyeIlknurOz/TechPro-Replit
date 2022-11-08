package tr_7_conditionstatement;

import java.util.Scanner;

public class C12 {
    //  Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
    //  Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
    //  İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
    // 13  ugly number  degildir        25     ugly number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int temp2 = 0;
        if (number <= 0) {
            System.out.println("Ugly number must be positive!");
        } else {
            int temp = number;
            while (true) {
                if (temp % 2 == 0) {
                    temp /= 2;
                } else if (temp % 3 == 0) {
                    temp /= 3;
                } else if (temp % 5 == 0) {
                    temp /= 5;
                } else {
                    temp2 = temp;
                    break;
                }
            }
            if (temp2 == 1) {
                System.out.println("Ugly number");
            } else {
                System.out.println("Another ugly number " + temp2);
                System.out.println("It is not ugly number!");
            }
        }
    }
}
