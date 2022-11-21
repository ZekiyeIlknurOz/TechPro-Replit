package eng_4_for_while;

public class C08_PrintAsciiValueOfChar {
    // Write a Java program that prints ascii values of characters from ‘a’ to ‘z’
    //  Ascii value of a = 97
    //  Ascii value of b = 98
    public static void main(String[] args) {
        for(int i = 'a';i<'z'+1;i++){
            System.out.println("Ascii value of " + (char)i + " = " + i);
        }
    }
}
