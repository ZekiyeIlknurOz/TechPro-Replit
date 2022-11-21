package tr_2_scanner;

import java.util.Scanner;

public class Scanner_4 {
    //  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
    //  Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
    //1 şeker = 1.7 gr
    //Örnek Çıktı:
    //Yılda 12.41 kg şeker kullanıyor.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi1: ");
        int sayi1 = input.nextInt();
        System.out.print("sayi2: ");
        int sayi2 = input.nextInt();
        double seker = 1.7D;
        double yildaToplam = 365*sayi1*sayi2*seker/1000;
        // soruda hata var 1000'e bolmem gerekliydi. Fakat
        // ciktidaki cevap icin 2000 yazdim
        // sayi 4 ve 5 olmali
        System.out.println("Yilda " + yildaToplam + " kg seker kullaniyor.");
        input.close();
    }
}
