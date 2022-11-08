package tr_2_scanner;

import java.util.Scanner;

public class Scanner_7 {

    public static void main(String[] args) {
        //  Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
        Scanner input = new Scanner(System.in);
        System.out.print("Double: ");
        double d = input.nextDouble();
        int i = (int)d;
        System.out.println(i);

    }
}
