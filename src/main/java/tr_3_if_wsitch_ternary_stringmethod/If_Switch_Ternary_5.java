package tr_3_if_wsitch_ternary_stringmethod;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class If_Switch_Ternary_5 {

    public static void main(String[] args) {
        //  Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
        //INPUT:
        //Ay Numarasi:2
        //Yil :2016
        //OUTPUT  :
        //Subat 2016 29 Gundur.
        Scanner input = new Scanner(System.in);
        System.out.print("Ay Numarasi: ");
        int ayNo = input.nextInt();
        System.out.print("Yil : ");
        int yil = input.nextInt();
        switch(ayNo){
            case 1: System.out.print("Ocak ");  break;
            case 2: System.out.print("Subat ");  break;
            case 3: System.out.print("Mart ");  break;
            case 4: System.out.print("Nisan ");  break;
            case 5: System.out.print("Mayis ");  break;
            case 6: System.out.print("Haziran ");  break;
            case 7: System.out.print("Temmuz ");  break;
            case 8: System.out.print("Agustos ");  break;
            case 9: System.out.print("Eylul ");  break;
            case 10: System.out.print("Ekim ");  break;
            case 11: System.out.print("Kasim ");  break;
            case 12: System.out.print("Aralik ");  break;
            default:
                System.out.print("Yanlis ay numarasi...");
        }

        Calendar takvim = new GregorianCalendar(yil, ayNo-1, 1);   // Ocak=0
        System.out.println(yil + " " + takvim.getActualMaximum(Calendar.DAY_OF_MONTH) + " Gundur.");
    }
}
