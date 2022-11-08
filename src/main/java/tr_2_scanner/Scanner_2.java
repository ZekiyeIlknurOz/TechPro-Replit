package tr_2_scanner;

import java.util.Scanner;

public class Scanner_2 {

    public static void main(String[] args) {
        //  Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        //Ornek Cikti :
        //Alan: 9
        //Cevre: 12
        Scanner input = new Scanner(System.in);
        System.out.print("Kenar uzunlugu: ");
        int sayi = input.nextInt();
        System.out.println("Alan: "+ sayi*sayi);
        System.out.println("Cevre: "+ 4*sayi);

    }
}
