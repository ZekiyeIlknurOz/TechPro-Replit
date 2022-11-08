package tr_7_conditionstatement;

import java.util.Scanner;

public class C03 {
    //  Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.
    //  Test Data:        12        34        23`
    //  Beklenen Çıktı:   En Buyuk Sayi: 34
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();
        String s = sayi1 > sayi2 ?
                (sayi1 > sayi3 ? String.valueOf(sayi1) : String.valueOf(sayi3)) :
                (sayi2 > sayi3 ? String.valueOf(sayi2) : String.valueOf(sayi3));
        System.out.println("En Buyuk Sayi: " + s);
    }
}
