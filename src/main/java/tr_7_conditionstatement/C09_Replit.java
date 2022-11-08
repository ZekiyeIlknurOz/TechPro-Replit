package tr_7_conditionstatement;

import java.util.Scanner;

public class C09_Replit {
    /*
           *
          ***
         *****
        *******
       *********
      ***********
     *************
      ***********
       *********
        *******
         *****
          ***
           *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yarim elmas uzunlugu: ");
        int elmas = input.nextInt();
        for (int i = 0; i < elmas;i++) {
            for(int j = elmas-1-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0;i<elmas-1;i++){
            for (int j = 0;j<i+1;j++){
                System.out.print(" ");
            }
            for (int k=elmas*2-3-2*i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
