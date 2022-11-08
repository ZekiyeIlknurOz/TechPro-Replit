package tr_5_arrays;

public class Arrays_3 {

    public static void main(String[] args) {
        //  Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
        //Array =  [20, 30, 25, 35, -16, 60, -100 ]
        //Beklenen Çıktı:
        //Array Sayılarının ortalaması: 7.0
        int arrInt[] = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        double average;
        for (int w : arrInt) {
            sum += w;
        }
        System.out.println(sum);
        average = (double) sum / arrInt.length;
        System.out.println("Array Sayilarinin ortalamasi: " + average);

    }
}
