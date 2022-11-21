package eng_5_method_arrays;

public class C03_SumOfDigits_Method {
    //  Write a method which accepts a String as parameter and
    //  prints the sum of the digits, present in the given string.
    //  input : ade1r4d3      output : 8
    //  Hint : Use Character.isDigit(), Integer.valueOf()
    public static void main(String[] args) {
        String str = "ade1r4d3";
        sumOfDigit(str);
    }

    public static void sumOfDigit(String str) {
        int sum = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(arr[i])) {
                int num = Integer.parseInt(String.valueOf(arr[i]));
                System.out.print(num + " ");
                sum += num;
            }
        }
        System.out.println("\n" + sum);
    }
}
