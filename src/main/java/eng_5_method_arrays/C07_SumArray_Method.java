package eng_5_method_arrays;

public class C07_SumArray_Method {

    public static void main(String[] args) {
        // Write a method that accepts an array as parameter and
        // returns sum off all elements in the array Then print the result in the main method.
        //input : {1,2,3,4,5,6,7,8};        output: 36
        int arr[] = {1,2,3,4,5,6,7,8};
        int sum = returnSum(arr);
        System.out.println(sum);
    }

    public static int returnSum(int[] arr){
        int sum = 0;
        for (int w : arr){
            sum += w;
        }
        return sum;
    }
}
