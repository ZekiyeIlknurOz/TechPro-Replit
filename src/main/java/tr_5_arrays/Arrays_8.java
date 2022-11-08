package tr_5_arrays;
import java.util.Arrays;
public class Arrays_8 {

    public static void main(String[] args) {
        //  Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
        //Array: [1232,2345,5467,678,3454,2312,3451]
        int[] sayi = {1232,2345,5467,678,3454,2312,3451};
        Arrays.sort(sayi);
        for(int w : sayi){
            System.out.print(w + " ");
        }
        System.out.println("\nEn buyuk 2. sayi: " + sayi[sayi.length-2]);

    }
}
