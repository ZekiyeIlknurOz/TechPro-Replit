package eng_4_for_while;

import java.util.Arrays;

public class C03_DuplicateChars {
    //  Write a code that returns the duplicate chars in a String array.(interview Question)
    //  Input : String str=“Javaisalsoeasy”
    //  Output: [a, s]
    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        String s = "";
        String[] arr = str.split("");
        for (String value : arr) {
            if (str.indexOf(value) != str.lastIndexOf(value)) {
                if (!s.contains(value)) {
                    s = s.concat(value);
                }
            }
        }
        String[] arr2 = s.split("");
        System.out.println(Arrays.toString(arr2));
    }
}
