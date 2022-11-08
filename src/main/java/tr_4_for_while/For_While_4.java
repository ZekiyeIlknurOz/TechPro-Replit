package tr_4_for_while;

import java.util.Scanner;

public class For_While_4 {

    public static void main(String[] args) {
        //  Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        //Input : 6
        //Output: 6!=6*5*4*3*2*1=720
        Scanner input = new Scanner(System.in);
        System.out.print("tamsayi : ");
        int sayi = input.nextInt();
        String s = sayi + "!=";
        int factoriyel = 1;
        do{
            factoriyel*=sayi;
            if(sayi==1){
                s = s + sayi;
            } else{
                s = s + sayi + "*";
            }
            sayi--;
        }while(sayi>0);
        System.out.println(s + "=" + factoriyel);

    }
}
