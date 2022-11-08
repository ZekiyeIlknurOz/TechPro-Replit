package tr_4_for_while;

import java.util.Arrays;

public class For_While_3 {

    public static void main(String[] args) {
        //  Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        //Input :
        //String str=“Javaisalsoeasy”
        //Output: a s
        String str = "Javaisalsoeasy";
        String s = "";
        for(int i = 0;i<str.length();i++){
            String c = str.substring(i,i+1);
            if(str.indexOf(c)!=str.lastIndexOf(c)){
                if(!s.contains(c)){
                    s = s.concat(c + " ");
                }
            }
        }
        String sonuc[] = s.split(" ");
        System.out.println(Arrays.toString(sonuc));

    }
}
