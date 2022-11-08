package tr_4_for_while;

public class For_While_5 {

    public static void main(String[] args) {
        //  100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
        //  OUTPUT  :
        //  100 98 96 94 92 … … … … 2 0
        int sayi = 100;
        ciftGoster(sayi);
    }

    public static void ciftGoster(int i) {
        if (i % 2 == 0 && i >= 0) {
            System.out.print(i + " ");
            ciftGoster(i - 2);
        }
    }
}
