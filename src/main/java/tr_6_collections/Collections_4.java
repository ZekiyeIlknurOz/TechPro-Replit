package tr_6_collections;

import java.util.ArrayList;
import java.util.List;

public class Collections_4 {
    /*  Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
        Array Elemanları: sari,yesil,mavi,pembe
        **mavi rengini turuncu ile değiştirelim.**
        Beklene Çıktı:
        [sari,yesil,mavi,pembe]
        [sari,yesil,turuncu,pembe]                  */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(List.of("sari","yesil", "mavi", "pembe"));
        System.out.println(myList);
        int idx = myList.indexOf("mavi");
        myList.set(idx,"turuncu");
        System.out.println(myList);

    }
}
