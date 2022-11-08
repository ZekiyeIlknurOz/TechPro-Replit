package tr_2_scanner;

import java.util.Scanner;

public class Scanner_3 {

    public static void main(String[] args) {
        //  Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin
        //  alanını ve çevresini konsola yazdıran bir program yazın.
        //Örnek Çıktı:
        //Alan: 32
        //Çevre: 24
        Scanner input = new Scanner(System.in);
        System.out.print("Kenar: ");
        int sayi1 = input.nextInt();        // 4
        System.out.print("Kenar: ");
        int sayi2 = input.nextInt();        // 8
        System.out.println("Alan: " + sayi1*sayi2);
        System.out.println("Cevre: " + 2*(sayi1+sayi2));

    }
}
