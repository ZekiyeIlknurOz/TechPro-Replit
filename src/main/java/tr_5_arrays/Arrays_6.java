package tr_5_arrays;
import java.util.Scanner;

public class Arrays_6 {

    public static void main(String[] args) {
        //  Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
        //Array: [12,15,43,23,56,76,78,90,77,43]
        //Aranan değer:56
        //Beklenen Çıktı:
        //56 sayısı arrayin 4. elemanı
        Scanner input = new Scanner(System.in);

        int arrInt[] = {12,15,43,23,56,76,78,90,77,43};
        System.out.println("Aranan deger:");
        int arananSayi = input.nextInt();
        int index = 0;
        for(int w : arrInt){
            if(arananSayi == arrInt[w]){
                index = 5;
            }
        }

    }
}
