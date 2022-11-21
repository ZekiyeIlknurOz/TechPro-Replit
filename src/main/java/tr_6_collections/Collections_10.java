package tr_6_collections;

import java.util.Collections;
import java.util.LinkedList;

public class Collections_10 {
    /*  Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
        LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
        **hint:  Collections.swap();**
        Beklene Çıktı:
        Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
        Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]        */
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("mavi");
        myList.add("kirmizi");
        myList.add("beyaz");
        myList.add("siyah");
        myList.add("yesil");
        myList.add("turuncu");
        System.out.println("Orjinal LinkedList: " + myList);
        Collections.swap(myList,0,3);
        System.out.println("Swap sonrasi durum: " + myList);

    }
}
