package tr_2_scanner;

import java.util.Scanner;

public class Scanner_7 {
    //  Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Double: ");
        double d = input.nextDouble();
        int i = (int)d;
        System.out.println(i);
        input.close();
    }
}
