package tr_2_scanner;

import java.util.Scanner;

public class Scanner_3 {
    //  Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin
    //  alanını ve çevresini konsola yazdıran bir program yazın.
    //Örnek Çıktı:
    //Alan: 32
    //Çevre: 24
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenar: ");
        int sayi1 = input.nextInt();        // 4
        System.out.print("2. Kenar: ");
        int sayi2 = input.nextInt();        // 8
        alan(sayi1, sayi2);
        System.out.println("Cevre: " + 2 * (sayi1 + sayi2));
        input.close();
    }

    private static void alan(int a, int b) {
        System.out.println("Alan: " + a * b);
    }
}
