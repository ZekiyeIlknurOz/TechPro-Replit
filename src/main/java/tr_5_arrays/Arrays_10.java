package tr_5_arrays;
import java.util.Scanner;

public class Arrays_10 {

    public static void main(String[] args) {
        //  Bir String değişkeni cümlesi verildiğinde,
        //  her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
        //Test Data:
        //sentence -> "Java is fun"
        //reversed **-> "**fun is Java**"**
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        char[] sentenceArray = sentence.toCharArray();
        // String sentenceArray[] = sentence.split(" ");
        String reversed = "";
        for(int i = sentenceArray.length-1;i>=0;i--){
            char temp = sentenceArray[i];
            reversed = reversed.concat(temp + " ");
        }
        System.out.println(sentence);
        //Kodlarınızı burada sonlandırınız ve verilen yardımcı kodları değiştirmeyiniz.
        System.out.println(reversed);

        //  *** run tests'deki ciktiya gore (karakter karakter)
        //  Scanner input = new Scanner(System.in);
        //  String sentence = input.nextLine();
        //  char sentenceChar[] = sentence.toCharArray();
        //  String reversed = "";
        //  for(int i = sentenceChar.length-1;i>=0;i--){
        //    char c = sentenceChar[i];
        //    reversed = reversed + c;
        //  }
        //  System.out.println("sentence -> \"" + sentence + "\"");
        //  //Kodlarinizi burada sonlandiriniz ve verilen yardimci kodlari degistirmeyiniz.
        //  System.out.println("reversed **-> \"**" + reversed.trim() + "**\"**");
    }
}
