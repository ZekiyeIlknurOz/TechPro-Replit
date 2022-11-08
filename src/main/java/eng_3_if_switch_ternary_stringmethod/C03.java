package eng_3_if_switch_ternary_stringmethod;
import java.util.Scanner;
public class C03 {

    static byte digitNumber = 0;
    public static byte findDigitNumber(long x) {
        while (x != 0) {
            x /= 10;
            digitNumber++;
        }
        return digitNumber;
    }

    public static void main(String[] args) {
        // 3
        Scanner input = new Scanner(System.in);
        System.out.print("First Number : ");
        long num1 = input.nextLong();
        System.out.print("Second Number : ");
        long num2 = input.nextLong();
        long sum = num1 + num2;
        String s = "";
        s = findDigitNumber(sum) > 10 ? ("OverFlow") : ("Sum of the numbers: " + sum);
        System.out.println(s);
        input.close();
    }
}
