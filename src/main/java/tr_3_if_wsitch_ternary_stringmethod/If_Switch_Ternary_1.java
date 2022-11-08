package tr_3_if_wsitch_ternary_stringmethod;

import java.util.Scanner;

public class If_Switch_Ternary_1 {

    public static void main(String[] args) {
        //  Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
        //IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
        //BMI 18,5'in altındaysa zayıfsınız
        //BMI 18,5 ile 25 arasında ise kilonuz idealdir
        //BMI 25-30 arasındaysa şişmansınız
        //BMI 30'dan büyük veya eşitse, obez
        //Input:
        //Agirlik : 71
        //Boy : 1,72
        //Output:
        //BMI : 23.99945916711736
        //Zayifsiniz.
        Scanner input = new Scanner(System.in);
        System.out.print("Agirlik : ");
        double kilo = input.nextDouble();
        System.out.print("Boy : ");
        double boy = input.nextDouble();
        double bmi = kilo/(boy*boy);
        System.out.println("BMI: " + bmi);
        if(bmi<18.5)
            System.out.println("Zayifsiniz.");
        else if(bmi>=18.5 && bmi<25)
            System.out.println("Kilonuz idealdir.");
        else if(bmi>=25 && bmi<30)
            System.out.println("Sismansiniz.");
        else if(bmi>=30)
            System.out.println("Obez.");

    }
}
