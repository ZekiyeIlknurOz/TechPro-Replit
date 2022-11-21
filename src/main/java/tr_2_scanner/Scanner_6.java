package tr_2_scanner;

import java.util.Scanner;

public class Scanner_6 {
    //  Kullanıcıdan bir Float değer girmesini isteyin,
    //  bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Float: ");
        float f = input.nextFloat();
        System.out.println("Short: " + (short)f);
        input.close();
    }
}
