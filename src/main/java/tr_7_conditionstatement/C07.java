package tr_7_conditionstatement;

import java.util.Scanner;

public class C07 {
    // Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        for (int i=1;i<11;i++){
            System.out.println(sayi + " x " + i + " = " + (sayi*i));
        }
    }
}
