package eng_3_if_switch_ternary_stringmethod;
import java.util.Scanner;
public class C01 {
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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Weight: ");
        double weight = input.nextDouble();
        System.out.print("Height: ");
        double height = input.nextDouble();
        double massIndex = weight / (Math.pow(height,2));
        String result = massIndex<18.5 ? ("You re weak") :
                (massIndex>=18.5 && massIndex<25 ? ("Your weight is ideal") :
                        (massIndex>=25 && massIndex<30 ? ("You re fat") : ("You re fat")));
        System.out.println("Your BMI is : " + massIndex);
        System.out.println(result);
        input.close();
    }
}
