package tr_4_for_while;

public class For_While_7 {

    public static void main(String[] args) {
        //  Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        //* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
        // herhangi bir sayı Mükemmel Sayı olarak bilinir.
        //Input :6
        //Output:6 Mukemmel Sayidir.
        //======================
        //Input :7
        //Output:7 Mukemmel Sayidir degildir.
        int sayi1 = 6, bolen1 = 0, i = 1;
        do{
            if(sayi1%i==0){
                bolen1+=i;
            }
            i++;
        }while(i<sayi1);
        if(bolen1==sayi1){
            System.out.println(sayi1 + " Mukemmel Sayidir." );
        }else{
            System.out.println(sayi1 + " Mukemmel Sayidir degildir.");
        }
        int sayi2 = 7, bolen2 = 0, j = 1;
        do{
            if(sayi2%j==0){
                bolen2+=j;
            }
            j++;
        }while(j<sayi2);
        if(bolen2==sayi2){
            System.out.println(sayi2 + " Mukemmel Sayidir." );
        }else{
            System.out.println(sayi2 + " Mukemmel Sayidir degildir.");
        }
    }
}
