package eng_3_if_switch_ternary_stringmethod;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class C05 {
    // Write a Java program to find the number of days in a month.
    // (Use Switch Case) (Interview Question / Leak Year)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a month number: ");
        byte month = input.nextByte();
        System.out.print("Input a year: ");
        int year = input.nextInt();
        switch (month){
            case 1:     System.out.print("January ");     break;
            case 2:     System.out.print("February ");     break;
            case 3:     System.out.print("March ");     break;
            case 4:     System.out.print("April ");     break;
            case 5:     System.out.print("May ");     break;
            case 6:     System.out.print("June ");     break;
            case 7:     System.out.print("July ");     break;
            case 8:     System.out.print("August ");     break;
            case 9:     System.out.print("September ");     break;
            case 10:    System.out.print("October ");     break;
            case 11:    System.out.print("November ");     break;
            case 12:    System.out.print("December ");     break;
            default:    System.out.print("Invalid Month ");
        }
        Calendar wanted = new GregorianCalendar(year,(month-1),1); //January=0
        System.out.println(year +" has "+ wanted.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
        input.close();
    }
}
