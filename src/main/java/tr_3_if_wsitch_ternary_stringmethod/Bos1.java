package tr_3_if_wsitch_ternary_stringmethod;

public class Bos1 {

    public static void main(String[] args) {
        String tamIsim = "     a";

        int boslukIndex = tamIsim.trim().indexOf(' ');

        char isimIlkHarf = tamIsim.trim().charAt(0);
        char soyIsimIlkHarf = tamIsim.trim().charAt(boslukIndex + 1);

        boolean ilkHarfIsimKüc = isimIlkHarf < 'A' || isimIlkHarf > 'Z';
        boolean ilkHarfSoyIsimKüc = soyIsimIlkHarf < 'A' || soyIsimIlkHarf > 'Z';

        boolean format = tamIsim.equals(tamIsim.toUpperCase());

        boolean bos = tamIsim.replaceAll("\\s", "").isEmpty();
        boolean harfVeBos = tamIsim.replaceAll(" ", "").replaceAll("[A-Za-z]", "").isEmpty();

        if (boslukIndex == -1) {
            System.out.println("Ad veya soyadi eksik ");}

        if (ilkHarfIsimKüc || ilkHarfSoyIsimKüc) {
            System.out.println("BAŞ HARFLERDE HATA VAR"); }
        if (format) {
            System.out.println("FORMAT HATASI"); }
        if (bos) {
            System.out.println("İSİM GİRİLMEDİ");
        }
        if (!harfVeBos) {
            System.out.println("geçersiz isim");  }
    }
}
