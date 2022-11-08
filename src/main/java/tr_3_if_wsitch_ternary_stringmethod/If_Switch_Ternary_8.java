package tr_3_if_wsitch_ternary_stringmethod;

import java.util.Scanner;

public class If_Switch_Ternary_8 {

    public static void main(String[] args) {
        //  Kullanıcıdan bir isim girmesini isteyin ve
        //  son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
        //Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
        //INPUT   : Mustafa
        //OUTPUT  : fafafa
        Scanner input = new Scanner(System.in);
        System.out.print("Isim giriniz: ");
        String isim = input.next().trim();
        String isimKopya = "";
        if(isim.length()>1){
            isimKopya = isim.substring(isim.length()-2);
            isimKopya = isimKopya.repeat(3);
        } else{
            System.out.println("Isim uzunlugu en az 2  olmali...");
        }
        System.out.println(isimKopya);
    }
}
