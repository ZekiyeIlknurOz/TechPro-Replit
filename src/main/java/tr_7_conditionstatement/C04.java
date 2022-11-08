package tr_7_conditionstatement;

import java.util.Scanner;

public class C04 {
    //  1 ile 7 arasında girilen bir tamsayı ile haftanın gününün adını gösteren bir Java kodu yazın.
    //  Beklenen Çıktı:       Pazartesi
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("[1-7] arasi gun giriniz: ");
        byte day = input.nextByte();
        switch (day){
            case 1: System.out.println("Pazar"); break;
            case 2: System.out.println("Pazartesi"); break;
            case 3: System.out.println("Sali"); break;
            case 4: System.out.println("Carsamba"); break;
            case 5: System.out.println("Persembe"); break;
            case 6: System.out.println("Cuma"); break;
            case 7: System.out.println("Cmartesi"); break;
            default:
                System.out.println("Hafta da 7 gun var.");
        }
    }
}
