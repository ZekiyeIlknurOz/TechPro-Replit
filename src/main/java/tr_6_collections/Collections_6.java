package tr_6_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections_6 {
    /*  Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
        LinkedList elemanları: sari,mavi,mor,yesil,beyaz
        Beklenen Çıktı:
        sari
        mavi
        mor
        yesil
        beyaz                 */
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>(List.of("sari","mavi", "mor", "yesil","beyaz"));
        for (String w : myList){
            System.out.println(w);
        }
    }
}
