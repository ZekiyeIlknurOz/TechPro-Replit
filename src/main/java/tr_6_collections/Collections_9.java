package tr_6_collections;

import java.util.*;

public class Collections_9 {
    /*  Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
        LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor
        Beklenen Çıktı:     Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
        LinkedList Tersi:
        mor
        beyaz
        kirmizi
        yesil
        mavi
        sari                                */
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>(List.of("sari", "mavi", "yesil", "kirmizi", "beyaz", "mor"));
        System.out.println("Orijinal linked list: " + myList);
        Collections.reverse(myList);
        printPreviously(myList);
    }

    static void printPreviously(LinkedList<String> myList){
        Iterator<String> itr = myList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
