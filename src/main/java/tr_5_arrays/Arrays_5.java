package tr_5_arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_5 {

    public static void main(String[] args) {
        //  yazılan değerin array içerisinde arayan Java Kodu yazınız.
        //Array: [1551,1223,1443,1267,1789,1023,2020]
        //Aranan Değer:2020
        //Beklenen Çıktı:**True**
        //Aranan Değer:2010
        //Beklenen Çıktı :**False**
        Scanner input = new Scanner(System.in);
        System.out.print("Aranan Deger:");
        int arananSayi = input.nextInt();
        int arrInt[] = {1551,1223,1443,1267,1789,1023,2020};
        Arrays.sort(arrInt);
        int i = Arrays.binarySearch(arrInt,arananSayi);
        if (i<0){
            System.out.println("Beklenen Cikti:**False**");
        } else {
            System.out.println("Beklenen Cikti:**True**");
        }
    }
}
