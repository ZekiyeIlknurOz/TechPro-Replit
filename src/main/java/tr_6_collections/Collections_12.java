package tr_6_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Collections_12 {
    /*  Bir HashSet oluşturalım ve HashSet elemanlarını
        TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
        HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
        Beklenen Çıktı:
        Tree Set Elemanlari:
        kirmizi
        mavi
        sari
        turuncu
        yesil               */
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        hSet.add("sari");
        hSet.add("mavi");
        hSet.add("yesil");
        hSet.add("turuncu");
        hSet.add("kirmizi");
        TreeSet<String> tSet = new TreeSet<>(hSet);
        for (String w : tSet){
            System.out.println(w);
        }


    }
}
