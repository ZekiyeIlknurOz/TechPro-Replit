package tr_3_if_wsitch_ternary_stringmethod;

import java.util.Scanner;

public class If_Switch_Ternary_3 {

    public static void main(String[] args) {
        //  Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
        //Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
        //Ornek:
        //INPUT  :
        //25
        //46
        //OUTPUT :
        //Numaralarin Toplami:
        //71
        Scanner input = new Scanner(System.in);
        System.out.print("First Number : ");
        long sayi1 = input.nextLong();
        String s = "";
        System.out.print("Second Number : ");
        long sayi2 = input.nextLong();
        long toplam = sayi1 + sayi2;
        byte bas3 = basamakKac(toplam);
        s = bas3 > 10 ? ("\nToplam OverFlow") : ("Sum: " + toplam);
        System.out.println(s);
    }

    public static byte basamakKac(long x) {
        byte basamakSayisi = 0;
        while (x != 0) {
            x /= 10;
            basamakSayisi++;
        }
        return basamakSayisi;
    }
}
