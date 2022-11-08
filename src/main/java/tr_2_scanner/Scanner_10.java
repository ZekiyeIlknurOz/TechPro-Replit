package tr_2_scanner;

import java.util.Scanner;

public class Scanner_10 {

    public static void main(String[] args) {
        //  Kullanıcıdan dakika girmesini isteyin,
        //  Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
        //INPUT:
        //Dakika sayısı: 3456789
        //OUTPUT :
        //3456789 dakika yaklaşık 6 yıl 210 gündür
        Scanner input = new Scanner(System.in);
        System.out.print("Dakika: ");
        int dakika = input.nextInt();
        int birgun = 24*60; //1440 dk 1 gun
        int gun = (dakika/birgun);
        int yil = (gun/365);
        gun -= (yil*365);
        System.out.println(dakika + " dakika yaklasik " + yil + " yil " + gun + " gundur.");

    }
}
