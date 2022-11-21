package eng_3_if_switch_ternary_stringmethod;

public class C07 {
    // Create 2 words : name1 and name2
    //if the name1 has even numbers of characters, then insert the second word in the middle of the first name
    //if the first word has odd numbers Then print the “Name2 cannot be inserted in the name1”
    //name1= mehmet
    //name2= ahmet
    //Print ==> mehahmetmet
    public static void main(String[] args) {
        String name1 = "mehmet";
        String name2 = "ahmet";
        int name1Len = name1.length();
        String newS = "";
        if(name1Len%2==0){
            int name1Mid = name1Len/2;
            newS += name1.substring(0,name1Mid).concat(name2).concat(name1.substring(name1Mid));
        }
        if(name1Len%2==0){
            System.out.print(newS);
        }else{
            System.out.print("Name2 cannot be inserted in the name1");
        }
    }
}
