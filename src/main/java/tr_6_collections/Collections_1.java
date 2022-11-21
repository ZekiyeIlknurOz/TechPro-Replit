package tr_6_collections;

import java.util.ArrayList;
import java.util.List;

public class Collections_1 {
    /*  Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
    Array elemanları:  siyah,sari,mavi,turuncu
    Beklenen Çıktı:
    siyah
    sari
    mavi
    turuncu                  */
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(List.of("siyah","sari","mavi","turuncu"));
        for (String w : myList){
            System.out.println(w);
        }

    }
}
