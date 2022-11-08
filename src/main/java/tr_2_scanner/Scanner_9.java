package tr_2_scanner;

import java.util.Scanner;

public class Scanner_9 {

    public static void main(String[] args) {
        //  Girilen zamanı saniyeye çeviren bir program yazınız.
        //Örnek Çıktı:
        //1 saat 10 dakika 50 saniye ==> 4250 saniye
        Scanner input = new Scanner(System.in);
        System.out.print("Saat: ");
        int saat = input.nextInt();
        System.out.print("Dakika: ");
        int dakika = input.nextInt();
        System.out.print("Saniye: ");
        int saniye = input.nextInt();
        int toplam = saat*3600+dakika*60+saniye;
        System.out.println(toplam + " saniye");

    }
}
