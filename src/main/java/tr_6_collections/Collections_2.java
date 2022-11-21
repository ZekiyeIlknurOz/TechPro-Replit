package tr_6_collections;

import java.util.ArrayList;
import java.util.List;

public class Collections_2 {
    /*  Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
        Array List:  siyah,mavi,kirmizi,beyaz
        en başa: **pembe**
        mavi-kirmizi arasına **yesil**  renk eklenecek.
        Beklenen Çıktı:     [pembe,siyah,mavi,yesil,kirmizi,beyaz]                  */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(List.of("siyah", "mavi", "kirmizi", "beyaz"));
        myList.add(0,"pembe");
        myList.add(3,"yesil");
        System.out.println(myList);

    }
}
