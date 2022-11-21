package eng_5_method_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C02_ReverseSentence_Method {
    //  Write a Java program that reverse a sentence
    //  by using Array (with all spaces and special characters).
    //  Input  : Coding is greate.        Output : .etaerg si gnidoC
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String str = input.nextLine();
        String sArr[] = reverse(str);
        for (String w : sArr){
            System.out.print(w);
        }
        input.close();
    }

    public static String[] reverse(String str) {
        String s[] = str.split("");
        List<String> list = new ArrayList<>(List.of(s));
        Collections.reverse(list);
        String s2[] = list.toArray(new String[0]);
        return s2;
    }
}
