package tr_6_collections;

import java.util.Iterator;
import java.util.SplittableRandom;
import java.util.TreeSet;

public class Collections_17 {
    /*  Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını
        tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.
        1. TreeSet: mavi,yesil,kirmizi,sari
        2. TreeSet: yesil,mavi,pembe,turuncu
        Beklenen Çıktı:
        1. TreeSet: [kirmizi,mavi,sari,yesil]
        2. TreeSet: [mavi,pembe,turuncu,yesil
        Karsilastirma Sonucu:
        no
        yes
        no
        yes                     */
    public static void main(String[] args) {
        TreeSet<String> tSet1 = new TreeSet<>();
        tSet1.add("mavi");
        tSet1.add("yesil");
        tSet1.add("kirmizi");
        tSet1.add("sari");
        TreeSet<String> tSet2 = new TreeSet<>();
        tSet2.add("yesil");
        tSet2.add("mavi");
        tSet2.add("pembe");
        tSet2.add("turuncu");
        System.out.println("1. TreeSet: " + tSet1);
        System.out.println("2. TreeSet: " + tSet2);
        Iterator<String> itr = tSet1.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            String result = !tSet2.contains(str) ? "no" : "yes";
            System.out.println(result);
        }

    }
}
