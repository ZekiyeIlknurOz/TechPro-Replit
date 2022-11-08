package tr_4_for_while;

import java.util.Scanner;

public class For_While_2 {

    public static void main(String[] args) {
        //  Kullanıcıdan 2 tamsayı girmesini ve
        //  ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        //Input :
        //30
        //40
        //	Beklenen Cikti:
        //30 ve 40 icin GCD = 10
        //30 ve 40 icin LCM = 120
        Scanner input = new Scanner(System.in);
        System.out.print("1. tamsayi: ");
        int sayi1 = input.nextInt();
        System.out.print("2. tamsayi: ");
        int sayi2 = input.nextInt();
        int gcd = 1, lcm, i= 2;

        while(i<=sayi1){
            if(sayi1%i==0 && sayi2%i==0){
                gcd=i;
            }
            i++;
        }
        lcm = (sayi1*sayi2)/gcd;
        System.out.println(sayi1 + " ve " + sayi2 + " icin GCD = " + gcd);
        System.out.println(sayi1 + " ve " + sayi2 + " icin LCM = " + lcm);

    }
}
