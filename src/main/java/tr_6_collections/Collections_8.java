package tr_6_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Collections_8 {
    /*      Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
        LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
        Beklenen Çıktı:     Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
        Listenin ilk elemani: sari
        listenin son elemani: beyaz                            */
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("sari");
        myList.add("mavi");
        myList.add("turuncu");
        myList.add("siyah");
        myList.add("yesil");
        myList.add("beyaz");
        Iterator<String> itr = myList.iterator();
        int idx = 0;
        while (itr.hasNext()) {
            String i = itr.next();
            if (myList.size() - 1 == idx) {
                System.out.println("Listenin son elemani: " + i);
            }
            if (myList.indexOf(myList.get(0))==idx){
                System.out.println("Listenin ilk elemani: " + i);
            }
            idx++;
        }
    }
}
