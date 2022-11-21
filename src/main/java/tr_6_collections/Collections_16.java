package tr_6_collections;

import java.util.TreeSet;

public class Collections_16 {
    /*  Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.
        TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
        Beklenen Çıktı:
        Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
        Tree eleman sayısı: 5               */
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("yesil");
        tSet.add("sari");
        tSet.add("mavi");
        tSet.add("kirmizi");
        tSet.add("pembe");
        System.out.println("Orjinal TreeSet: " + tSet);
        System.out.println("Tree eleman sayisi: " + tSet.size());

    }
}
