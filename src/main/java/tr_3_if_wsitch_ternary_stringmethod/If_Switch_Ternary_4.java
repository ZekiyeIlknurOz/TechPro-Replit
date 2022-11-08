package tr_3_if_wsitch_ternary_stringmethod;

import java.util.Scanner;

public class If_Switch_Ternary_4 {

    public static void main(String[] args) {
        //  Char değişken yanıtının değerini test eden ve
        //  aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
        //yanıt a ise, --> "Talebiniz işleniyor" mesajı yazdırılır
        //yanıt b ise, --> "yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır
        //yanıt c ise, --> "Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
        //başka herhangi bir yanıt değeri için, --> "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
        Scanner input = new Scanner(System.in);
        System.out.print("Bir karakter giriniz: ");
        char c = input.next().toLowerCase().trim().charAt(0);
        System.out.println("Girilen karakter " + c);
        switch (c) {
            case 'a':
                System.out.println("Talebiniz isleniyor");
                break;
            case 'b':
                System.out.println("yine de ilgilendiginiz için tesekkur ederiz");
                break;
            case 'c':
                System.out.println("Uzgunuz, su anda herhangi bir yardim yok");
                break;
            default:
                System.out.println("Gecersiz giris, lutfen tekrar deneyin!");
        }
    }
}
