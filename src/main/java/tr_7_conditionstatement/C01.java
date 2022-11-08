package tr_7_conditionstatement;

import java.util.Scanner;

public class C01 {
    // Girilen sayının pozitif, negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (input == 0) {
            System.out.println("Sayi Sifir");
        } else if (input < Math.max(input, 0)) {
            System.out.println("Sayi Negatif");
        } else if (input == Math.max(input, 0)) {
            System.out.println("Sayi Pozitif");
        }
    }
}
