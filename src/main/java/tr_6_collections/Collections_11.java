package tr_6_collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collections_11 {
    /*  HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
        HashSet List: sari,mavi,kirmizi,yesil,mor
        Beklenen Çıktı:
        TreeSet elements:
        kirmizi
        mavi
        mor
        sari
        yesil        */
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        hSet.add("sari");
        hSet.add("mavi");
        hSet.add("kirmizi");
        hSet.add("yesil");
        hSet.add("mor");
        TreeSet<String> tSet = new TreeSet<>(hSet);
        for (String w : tSet){
            System.out.println(w);
        }


    }
}
