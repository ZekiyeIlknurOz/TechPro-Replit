package tr_6_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Collections_15 {
    /*  Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.
        TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
        Beklenen Çıktı:
        Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
        ilk elemen: kirmizi
        son eleman: yesil               */
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("sari");
        tSet.add("mavi");
        tSet.add("yesil");
        tSet.add("kirmizi");
        tSet.add("turuncu");
        tSet.add("pembe");
        System.out.println("Orjinal Tree: " + tSet);
        System.out.println("ilk eleman: " + tSet.first());
        System.out.println("son eleman: " + tSet.last());
    }
}
