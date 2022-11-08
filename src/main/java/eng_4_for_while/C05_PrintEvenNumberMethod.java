package eng_4_for_while;

public class C05_PrintEvenNumberMethod {

    public static void main(String[] args) {
        // Print even numbers from 20 to 0 but do not use decrement (i--).
        // OUTPUT  : Even Numbers from 20 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
        int num = 20;
        System.out.print("Even Numbers from " + num + " to 0 are: ");
        printEven(num);
    }

    public static void printEven(int x){
        if (x==0){
            System.out.print(x);
        } else if (x%2==0 && x>0){
            System.out.print(x + " ");
            printEven(x-2);
        }
    }
}
