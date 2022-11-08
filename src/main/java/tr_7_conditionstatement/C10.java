package tr_7_conditionstatement;

import java.util.Scanner;

public class C10 {
    // 5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.
    //      1
    //     1 1
    //    1 2 1
    //   1 3 3 1
    //  1 4 6 4 1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Uzunluk: ");
        int lineNumber = input.nextInt();
        int number,i,j,k;
        for (i = 0; i < lineNumber;i++) {
            for(j = lineNumber;j>i;j--){
                System.out.print(" ");
            }
            number = 1;
            for(k=0;k<=i;k++){
                System.out.print(String.format("%1d",number) + " ");
                number = number * (i-k) / (k+1);
            }
            System.out.println();
        }
    }
}
