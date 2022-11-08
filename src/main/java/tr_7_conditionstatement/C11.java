package tr_7_conditionstatement;

import java.util.Scanner;

public class C11 {
    // Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    // değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    // 1 karakterden fazla ise hata mesajı göstersin.
    // (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sesli harf giriniz: ");
        String c = input.next();
        String sesli = "AEIOUaeiou";
        String harfler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        if (c.length() != 1 || !harfler.contains(c)) {
            System.out.println("Girdiginiz deger harf degil!");
        } else {
            if (sesli.contains(c)){
                System.out.println("Sesli harf");
            } else {
                System.out.println("Sessiz harf");
            }
        }


    }
}
