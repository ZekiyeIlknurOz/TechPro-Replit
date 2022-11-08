package tr_1_syso;

public class Tr_Syso_6 {

    public static void main(String[] args) {
        //  Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.
        //Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50
        //Ornek Cikti:
        //Sayilarin Ortalamasi : 30
        int[] arr = new int[]{22,20,30,28,50};
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        float ortalama = (float)sum /arr.length;
        System.out.println("Sayilarin Ortalamasi : " + (int)ortalama);
    }
}
