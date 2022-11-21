package tr_5_arrays;
import java.util.Arrays;
public class Arrays_4 {

    public static void main(String[] args) {
        //  Aşağıdaki grid şeklini yazan Java Kodunu yazınız.
        //Beklenen Çıktı:
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        String[][] arr = new String[10][10];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], "0 ");
        }
        System.out.println(Arrays.deepToString(arr));
        for (String[] w : arr) {
            for (String t : w){
                System.out.print(t);
            }
            System.out.println();
        }
    }
}
