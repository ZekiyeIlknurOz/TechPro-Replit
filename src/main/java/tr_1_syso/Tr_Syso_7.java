package tr_1_syso;

public class Tr_Syso_7 {
    //  Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
    //int a= 3;
    //int b= 5;
    //Ornek Cikti:
    //a=5
    //b=3
    public static void main(String[] args) {
        int a=3,b=5,temp;
        temp = b;
        b=a;
        a=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
