package tr_5_arrays;

import java.util.Arrays;

public class Arrays_1 {

    public static void main(String[] args) {
        //  Karışık verilen sayıları  ve kelimeleri  sıralayan Java kodunun yazınız.
        //not: Test datadaki değerleri kullanınız.
        //Test Data:
        //[1232, 1134,2345,1022]
        //[Java, Python, PHP, C#, C Programming, C++]
        //Beklenen Çıktı:
        //[1022,1134,1232,2345]
        //[C Programming, C#, C++, Java, PHP, Python]
        int arrInt[]= {1232,1134,2345,1022};
        Arrays.sort(arrInt);
        System.out.print(Arrays.toString(arrInt));

        System.out.println();

        String arrString[] = {"C Programming", "C#", "C++", "Java", "PHP", "Python"};
        int size  =arrString.length;
        for(int i = 0; i<size;i++){
            for(int j=i+1; j<size;j++){
                if(arrString[i].compareTo(arrString[j])>0){
                    String temp = arrString[i];
                    arrString[i]=arrString[j];
                    arrString[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arrString));



    }
}
