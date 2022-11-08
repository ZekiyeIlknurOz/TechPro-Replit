package tr_4_for_while;

public class For_While_10 {

    static int sum=0;

    public static void main(String[] args) {
        //  1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
        //OutPut:
        //Sayilarin Toplami : 5050
        int sayi = 100;
        sumNumber(sayi);
        System.out.println("Sayilarin Toplami : " + sum);

    }

    static void sumNumber(int i) {
        if (i > 0) {
            sumNumber(i - 1);
            sum += i;
        }
    }
}
