package tr_6_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Collections_13 {
    /*  Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.
        TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
        Beklenen Çıktı:
        beyaz
        kirmizi
        mavi
        sari
        siyah
        yesil               */
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("yesil");
        tSet.add("mavi");
        tSet.add("kirmizi");
        tSet.add("sari");
        tSet.add("beyaz");
        tSet.add("siyah");
        for (String w : tSet){
            System.out.println(w);
        }
    }
}
