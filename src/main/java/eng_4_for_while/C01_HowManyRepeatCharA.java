package eng_4_for_while;

import java.util.Scanner;

public class C01_HowManyRepeatCharA {

    public static void main(String[] args) {
        //  Ask user to enter a name and a character,
        //  then check how many times the character is repeated in the name using loops in the name
        //  char ch1= 'a' ;
        //  String name =“John came late"
        //  Expected Output: Number of a = 2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter character: ");
        String wantedChar = input.nextLine();
        int counter=0;
        for (int i = 0;i<name.length();i++){
            String c = name.substring(i,i+1);
            if(wantedChar.equals(c)){
                counter++;
            }
        }
        System.out.println("number of " + wantedChar + " = " + counter);


    }
}
