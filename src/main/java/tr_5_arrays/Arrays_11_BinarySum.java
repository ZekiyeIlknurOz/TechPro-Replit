package tr_5_arrays;

import java.util.Scanner;

public class Arrays_11_BinarySum {
    //  Kullanıcının gireceği iki **binary** sayıyı toplayan  Java kodunu yazınız.
    //  Test Data:  birinci binary number: 100010
    //              ikinci  binary number: 110010
    //  Beklenen Çıktı:     1010100
    public static void main(String[] args) {
        int binary1, binary2;
        int i = 0, remainder = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        binary1 = in.nextInt();
        binary2 = in.nextInt();
        sum = binary1 + binary2;
        System.out.println("sum = " + sum);
        String str = String.valueOf(sum);
        while (str.contains("2")){
            if (str.contains("02")) {
                str = str.replace("02", "10");
            } else if (str.contains("12")){
                str = str.replace("12","20");
            } else if (str.startsWith("2")) {
                str = str.replace("2", "10");
            }
        }
        System.out.println("Binary sum = " + str);
    }
}
