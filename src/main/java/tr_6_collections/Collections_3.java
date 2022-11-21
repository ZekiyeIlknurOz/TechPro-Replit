package tr_6_collections;

import java.util.ArrayList;
import java.util.List;

public class Collections_3 {
    /*  Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
        ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu
        Beklenen Çıktı:
        Arrayin 1. elemani: beyaz
        Arrayin 3. elemani: sari                  */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(List.of("beyaz","siyah", "sari", "kirmizi", "turuncu"));
        String firstElement = myList.get(0);
        String thirdElement = myList.get(2);

        System.out.println("Arrayin 1. elemani: " + firstElement);
        System.out.println("Arrayin 3. elemani: " + thirdElement);

    }
}
