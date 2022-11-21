package tr_6_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Collections_14 {
    /*  Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından
        descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.
        TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
        Beklenen Çıktı:
        Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
        Tersten Siralanisi:
        yesil
        turuncu
        sari
        mavi
        kirmizi               */
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("yesil");
        tSet.add("sari");
        tSet.add("mavi");
        tSet.add("turuncu");
        tSet.add("kirmizi");
        System.out.println("Orjinal Tree sonucu: " + tSet);
        Iterator<String> itr = tSet.descendingIterator();
        while (itr.hasNext() ) {
            String w = itr.next();
            System.out.println(w);
        }
    }
}
