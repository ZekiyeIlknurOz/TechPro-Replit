package eng_4_for_while;

import java.util.Arrays;

public class C03_DuplicateChars {

    public static void main(String[] args) {
        //  Write a code that returns the duplicate chars in a String array.(interview Question)
        //  Input : String str=“Javaisalsoeasy”
        //  Output: [a, s]
        String str = "Javaisalsoeasy";
        String s = "";
        for (int i=0;i<str.length();i++){
            String c = str.substring(i,i+1);
            if (str.indexOf(c)!=str.lastIndexOf(c)){
                if (!s.contains(c)){
                    s = s.concat(c);
                }
            }
        }
        String arr[] = s.split("");
        System.out.println(Arrays.toString(arr));

    }
}
