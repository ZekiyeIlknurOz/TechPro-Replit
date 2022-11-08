package tr_7_conditionstatement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class C05 {
    //  1 ile 12 arasında girilen sayıdan ve yıldan  yılın hangi ayı olduğunun ve
    //  o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.
    //  Beklenen çıktı:   2016 yili Subat ayi 29 gun
    //  Beklenen Çıktı:   1998 yili Nisan ayi 30 gun
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        Calendar calendar = new GregorianCalendar(year, month-1, 1);
        String monthStr = new SimpleDateFormat("MMMM").format(calendar.getTime());
        System.out.println(year + " yili " + monthStr + " ayi " +
                calendar.getActualMaximum(Calendar.DAY_OF_MONTH) + " gun");
    }
}
