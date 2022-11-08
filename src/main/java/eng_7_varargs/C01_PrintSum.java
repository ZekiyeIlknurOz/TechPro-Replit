package eng_7_varargs;

public class C01_PrintSum {
    //  Write a return method that accepts more than one integer as parameter
    //  and prints the sum of integers
    //  Method name = sum
    //  if you call method like that
    //  sum(1,2,3) output =6
    //  sum(1,2,3,4,5) output =15
    //  sum(1,2) output=3
    public static void main(String[] args) {
        sum(1,2,3);
        sum(1,2,3,4,5);
        sum(1,2);
    }

    public static void sum(int ...num) {
        int sum = 0;
        for (int w : num){
            sum += w;
        }
        System.out.println(sum);
    }
}
