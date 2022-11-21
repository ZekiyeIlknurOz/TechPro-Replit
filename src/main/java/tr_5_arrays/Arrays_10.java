package tr_5_arrays;
import java.util.Scanner;

public class Arrays_10 {
    //  Bir String değişkeni cümlesi verildiğinde,
    //  her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
    //Test Data:
    //sentence -> "Java is fun"
    //reversed **-> "**fun is Java**"**
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String sentenceArray[] = sentence.split(" ");
        String reversed = "";
        for(int i = sentenceArray.length-1;i>=0;i--){
            String temp = sentenceArray[i];
            reversed = reversed.concat(temp + " ");
        }
        System.out.println("reversed **-> \"**" + reversed.trim() + "**\"**");
        //Kodlarinizi burada sonlandiriniz ve verilen yardimci kodlari degistirmeyiniz.
    }
}
