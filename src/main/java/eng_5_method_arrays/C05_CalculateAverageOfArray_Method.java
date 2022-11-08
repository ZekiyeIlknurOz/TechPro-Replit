package eng_5_method_arrays;

import java.text.DecimalFormat;

public class C05_CalculateAverageOfArray_Method {

    public static double sum = 0;
    public static void main(String[] args) {
        //  Write a java program that calculates the average value of array elements
        //  input[]= {1,2,3,4,5,6,7}        Output : 4
        int input[]= {1,2,3,4,5,6,7,8,91};
        sum = calculateAverage(input);
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println(df.format(sum));
    }
    public static double calculateAverage(int[] arr){
        for (int w : arr){
            sum += w;
        }
        return sum/arr.length;
    }
}
