package tr_6_collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Collections_18 {
    /*  Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.
        priority queue elemanları: sari,yesil,mavi,kirmizi
        Beklenen Çıktı:
        Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]                     */
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>();
        pQueue.add("sari");
        pQueue.add("yesil");
        pQueue.add("mavi");
        pQueue.add("kirmizi");
        System.out.println("Priority Queue elemanlari: " + pQueue);

    }
}
