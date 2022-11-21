package tr_5_arrays;

public class Arrays_9 {

    public static void main(String[] args) {
        //  Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
        //Array: [1,2,3,4,5,6,7,8,9]
        //Beklenen Çıktı:
        //Tek Sayilar: 5
        //Cift Sayilar: 4
        int sayi[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int cift = 0, tek = 0;
        for (int w : sayi) {
            if (w % 2 == 0) {
                cift++;
            } else {
                tek++;
            }
        }
        System.out.println("Tek Sayilar: " + tek);
        System.out.println("Cift Sayilar: " + cift);

    }
}
