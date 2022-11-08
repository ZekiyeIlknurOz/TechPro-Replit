package tr_7_conditionstatement;

import java.util.Scanner;

public class C09 {
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
        System.out.print("Yarim elmas uzunlugu: ");
        int elmas = input.nextInt();
        for (int i = 0,j=1; i < elmas;i++,j+=2) {
            if (j<elmas*2){
                System.out.print(" ".repeat(elmas-1-i));
                System.out.print("*".repeat(j));
            }

            System.out.println();
        }
        for (int i=0,j=elmas*2-3;i<elmas-1;i++,j-=2){
            if (j>0){
                System.out.print(" ".repeat(i+1));
                System.out.print("*".repeat(j));

            }
            System.out.println();
        }

    }
}
