package tr_6_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Collections_7 {
    /*      bir LinkedList oluşturalım ve Iterator methodunu kullanarak
            listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.
            LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
            1. elemandan itibaren yazdıralım.
                Beklenen Çıktı:
            beyaz
            mavi
            yesil
            turuncu                              */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> myList = new LinkedList<>();
        myList.add("sari");
        myList.add("beyaz");
        myList.add("mavi");
        myList.add("yesil");
        myList.add("turuncu");
        Iterator<String> itr = myList.iterator();
        int index = input.nextInt();
        int idx = 1;
        while (itr.hasNext()) {
            String i = itr.next();
            if (index < idx) {
                System.out.println(i);
            }
            idx++;
        }
    }
}
