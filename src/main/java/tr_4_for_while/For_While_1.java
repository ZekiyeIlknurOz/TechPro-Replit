package tr_4_for_while;
import java.util.Scanner;
public class For_While_1 {

    public static void main(String[] args) {
        //  Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        //  ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        //      char ch1= 'a' ;
        //      String name =“John came late"
        //		Expected Output:
        //      Number of a = 2
        Scanner input = new Scanner(System.in);
        System.out.print("Isim : ");
        String isim = input.nextLine().trim();
        System.out.print("Karakter : ");
        String c = input.next().substring(0,1);
        int count = 0;
        for(int i=0;i<isim.length();i++){
            if(isim.substring(i,i+1).equals(c)){
                count++;
            }
        }
        System.out.println("Number of a = " + count);

    }
}
