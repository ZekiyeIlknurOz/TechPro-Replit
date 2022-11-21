package tr_6_collections;

import java.util.ArrayList;
import java.util.List;

public class Collections_5 {
    /*  Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
        ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
        Beklenen Çıktı:
        Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
        siyah
        mavi
        kirmizi
        yesil
        mor
        turuncu                  */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(List.of("siyah","mavi", "kirmizi", "yesil","mor","turuncu"));
        System.out.println("Orjinal array list: " + myList);
        for (int i = 0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}
