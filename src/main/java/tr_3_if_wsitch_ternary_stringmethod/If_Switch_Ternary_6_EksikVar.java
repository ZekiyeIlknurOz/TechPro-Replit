package tr_3_if_wsitch_ternary_stringmethod;

import java.util.Scanner;

public class If_Switch_Ternary_6_EksikVar {

    public static void main(String[] args) {
        //  Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        //Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        //Eger aynı karakterlere sahipse
        //"isim ayni karakterlere sahiptir." yazdirin.
        //Eger ayni kaakterlere sahip degilse
        //"Dizenin benzersiz karakterleri var" yazdirin.
        //Ternary kullanin.
        Scanner input = new Scanner(System.in);
        System.out.print("Isim: ");
        String isim = input.nextLine();
        String[] arr = isim.split("");
        String[] brr;
        int counter = 0;
        //1.yol
        if (isim.isEmpty()) {
            System.out.println("Hata!..Isim bos olamaz...");
        } else if (isim.length() == 3) {
            for (String w : arr) {
                if (isim.indexOf(w) != isim.lastIndexOf(w)) {
                    counter++;
                }
            }
            String s = counter!=0 ? "isim ayni karakterlere sahiptir." : "Dizenin benzersiz karakterleri var";
            System.out.println(s);
        } else {
            System.out.println("Isim 3 karakter olmali...");
        }
        //2.yol
    }
}
