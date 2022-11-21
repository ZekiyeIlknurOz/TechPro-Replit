package tr_5_arrays;

import java.util.Scanner;

public class Arrays_11_BinarySum_Method {
    //  Kullanıcının gireceği iki **binary** sayıyı toplayan  Java kodunu yazınız.
    //  Test Data:  birinci binary number: 100010
    //              ikinci  binary number: 110010
    //  Beklenen Çıktı:     1010100
    public static void main(String[] args) {
        String firstBinary = "100010";
        String secondBinary = "110010";

        int a = Integer.parseInt(firstBinary, 2);
        int b = Integer.parseInt(secondBinary, 2);
        int c = a + b;

        System.out.println(Integer.toBinaryString(c));
    }
}
