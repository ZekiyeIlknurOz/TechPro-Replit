package tr_4_for_while;

import java.util.Scanner;

public class For_While_9 {

    public static void main(String[] args) {
        //  Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        //Input  :1238
        //Output :Girilen Numananin Tersi: 8321
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi : ");
        int sayi = input.nextInt();
        int tersSayi=0;
        int sonSayi = 0;
        while(sayi!=0){
            sonSayi = sayi%10;
            tersSayi = tersSayi * 10 + sonSayi;
            sayi/=10;
        }
        System.out.println("Girilen Numananin Tersi: " + tersSayi);

    }
}
