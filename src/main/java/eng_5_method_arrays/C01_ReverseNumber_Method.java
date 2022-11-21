package eng_5_method_arrays;

public class C01_ReverseNumber_Method {
    // Write a return method to reverse number.
    // Input  : 12345        Output : 54321
    public static void main(String[] args) {
        int number = 123456789;
        int reverseNumber = reverse(number);
        System.out.println(reverseNumber);
    }

    public static int reverse(int number) {
        String s = String.valueOf(number);
        String newS = "";
        for (int i = s.length(); i > 0; i--) {
            newS = newS.concat(s.substring(i - 1, i));
        }
        return Integer.parseInt(newS);
    }
}
