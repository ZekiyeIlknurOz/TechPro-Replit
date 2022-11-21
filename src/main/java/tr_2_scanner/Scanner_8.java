package tr_2_scanner;
import java.util.Scanner;
public class Scanner_8 {
    //  Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının
    //  toplamını bulmasını isteyin.
    //   Örnek Çıktı:
    //   Verilen tamsayının rakamları toplamı 10'dur.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("3 basamakli sayi giriniz: ");
        int sayi = input.nextInt();
        int digitSum = 0;
        int counter = basamakSayisi(sayi);
        if (counter == 3) {
            if (sayi < 0) {
                sayi = Math.abs(sayi);
                digitSum = basamakToplami(sayi);
            } else {
                digitSum = basamakToplami(sayi);
            }
            System.out.println("Verilen tamsayinin rakamlari toplami " + digitSum + "\'dur.");
        } else {
            System.out.println("Sayi 3 basamakli degil!");
        }
    }
    public static int basamakToplami(int x) {
        int digitSum = 0;
        do {
            digitSum += x % 10;
            x /= 10;
        } while (x > 0);
        return digitSum;
    }
    public static int basamakSayisi(int x){
        int counter = 0;
        boolean sayiBasamakliMi = true;
        do {
            if (x != 0) {
                x /= 10;
                counter++;
            } else {
                sayiBasamakliMi = false;
            }
        } while (sayiBasamakliMi);
        return counter;
    }

    /*
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("3 basamakli sayi giriniz: ");
    int sayi = input.nextInt();
    int digitSum = 0;
    do{
        digitSum += sayi%10;
        sayi/=10;
    }while(sayi>0);
    System.out.println("Verilen tamsayinin rakamlari toplami " + digitSum + "\'dur.");
    input.close();
   }
     */
}
