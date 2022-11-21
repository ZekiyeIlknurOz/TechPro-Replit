package tr_5_arrays;

public class Arrays_2 {

    public static void main(String[] args) {
        //  Array deki sayıları toplayan Java kodunu yazınız.
        //array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //Beklenen Çıktı:
        //Array toplamı: 55
        int arrInt[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int w : arrInt) {
            sum += w;
        }
        System.out.println("Array toplami: " + sum);

    }
}
