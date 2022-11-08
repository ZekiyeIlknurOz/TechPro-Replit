package eng_3_if_switch_ternary_stringmethod;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {
        //  Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak
        //  verilen formata ceviren java kodunu yaziniz.
        //Input :
        //John White
        //1234234534561478
        //Output :
        //Name : J*** W****
        //CCN  : **** **** **** 1478
        //* Ilk Harfler Buyuk harf ile baslamalidir.
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.next().trim();
        name = name.substring(0, 1).toUpperCase().concat(name.substring(1));
        System.out.print("Surname: ");
        String surname = input.next().trim();
        surname = surname.substring(0, 1).toUpperCase().concat(surname.substring(1));
        String creditCard = "";
        do {
            System.out.print("Enter credit card no (16 digit) : ");
            creditCard = input.next();
            if (creditCard.length() != 16) {
                System.out.println("Credit card must be 16 digit!..");
            }
        } while (creditCard.length() != 16);
        name = name.substring(0, 1).concat(name.substring(1, name.length()).
                replaceAll("[a-z0-9]", "*"));
        surname = surname.charAt(0) + surname.substring(1, surname.length()).
                replaceAll("[a-z0-9]", "*");
        System.out.println("Name :"+name.concat(" " + surname).trim());
        creditCard = creditCard.substring(0, 12).replaceAll("[0-9]", "*").
                concat(creditCard.substring(12));
        String s = "";
        for (int i = 0; i < creditCard.length() ; i++) {
            if (i % 4 == 0) {
                s = s.concat(creditCard.substring(i, i+4)).concat(" ");
            }
        }
        System.out.println("CCN  :"+s.trim());

    }
}
