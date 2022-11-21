package tr_3_if_wsitch_ternary_stringmethod;
import java.time.Year;
import java.time.*;
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
        /*
        Year yearIsLeap = new Year.of(2016);
        System.out.println(yearIsLeap.isLeap());
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Ay Numarasi: ");
        int ayNo = input.nextInt();
        System.out.print("Yil : ");
        int yil = input.nextInt();
        String monthName = "";
        switch(ayNo){
            case 1: monthName = "Ocak";  break;
            case 2: monthName = "Subat";  break;
            case 3: monthName = "Mart";  break;
            case 4: monthName = "Nisan";  break;
            case 5: monthName = "Mayis";  break;
            case 6: monthName = "Haziran";  break;
            case 7: monthName = "Temmuz";  break;
            case 8: monthName = "Agustos";  break;
            case 9: monthName = "Eylul";  break;
            case 10: monthName = "Ekim";  break;
            case 11: monthName = "Kasim";  break;
            case 12: monthName = "Aralik";  break;
            default:
                System.out.print("Yanlis ay numarasi...");
        }

        Calendar takvim = new GregorianCalendar(yil, ayNo-1, 1);   // Ocak=0
        System.out.println(monthName + " " + yil + " " + takvim.getActualMaximum(Calendar.DAY_OF_MONTH) + " Gundur.");
    }
}
