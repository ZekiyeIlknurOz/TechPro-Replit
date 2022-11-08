package tr_5_arrays;

import java.util.Arrays;

public class Arrays_1_2 {

    public static void main(String[] args) {
        //  Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
        //not: Test datadaki değerleri kullanınız.
        //Test Data:
        //[1232, 1134,2345,1022]
        //[Java, Python, PHP, C#, C Programming, C++]
        //Beklenen Çıktı:
        //[1022,1134,1232,2345]
        //[C Programming, C#, C++, Java, PHP, Python]
        int arrInt[]= {1232,1134,2345,1022};
        Arrays.sort(arrInt);
        System.out.println(Arrays.toString(arrInt));
        String arrString[] = {"C Programming", "C#", "C++", "Java", "PHP", "Python"};
        Arrays.sort(arrString);
        System.out.println(Arrays.toString(arrString));



    }
}
