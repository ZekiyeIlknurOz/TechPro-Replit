package tr_3_if_wsitch_ternary_stringmethod;

public class If_Switch_Ternary_7 {

    public static void main(String[] args) {
        //  2 kelime oluşturun: isim1 ve isim2
        //        isim1 çift sayıda karakter içeriyorsa,
        //        ikinci kelimeyi ilk adın ortasına yerleştirin
        //        ilk kelime tek sayida karakter iceriyorsa
        //        “isim1, isim2 ye eklenemiyor” yazdırın
        //        Örneğin:
        //        isim1= mehmet
        //        isim2= ahmet
        //        Yazdır ==> mehahmetmet
        //
        //        isim1= memet
        //        isim2= ahmet
        //        Yazdır ==> isim1, isim2 ye eklenemiyor
        String isim1= "memet";
        // "memet" -->  isim1, isim2 ye eklenemiyor.
        // String isim1 = "mehmet";
        // "mehmet" --> mehahmetmet
        String isim2 = "ahmet";
        String eklenmisIsim  = "";
        int isim1Length = isim1.length();
        if(isim1.length()%2==0){
            eklenmisIsim = isim1.substring(0,isim1.length()/2).
                    concat(isim2).concat(isim1.substring(isim1.length()/2));
        } else{
            System.out.println("isim1, isim2 ye eklenemiyor.");
        }
        System.out.println(eklenmisIsim);
    }
}
