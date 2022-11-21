package tr_5_arrays;

import java.util.Map;
import java.util.Scanner;

public class Arrays_11_BinarySum_2 {
    //  Kullanıcının gireceği iki **binary** sayıyı toplayan  Java kodunu yazınız.
    //  Test Data:  birinci binary number: 100010
    //              ikinci  binary number: 110010
    //  Beklenen Çıktı:     1010100
    public static void main(String[] args) {
        int binary1, binary2;
        int i = 0, remainder = 0;
        //int sum = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);
        binary1 = in.nextInt();
        binary2 = in.nextInt();
        int counter=0;
        do{
            int s= (int)((binary1%10) + (binary2%10)+remainder);
            remainder=0;
            if(s<2){
                sum[i]=s;
            }else {
                sum[i]=(s%2);
                remainder++;
            }
            binary1 = binary1/10;
            binary2 = binary2/10;
            counter++;
            if(binary1==0||binary2==0){
                break;
            }
            i++;
        }while(i<20);
        System.out.print(remainder);
        for(int k =counter-1;k>-1;k--){
            System.out.print(sum[k]);
        }
    }
}
