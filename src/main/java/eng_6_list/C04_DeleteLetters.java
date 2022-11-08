package eng_6_list;

import java.util.ArrayList;
import java.util.List;

public class C04_DeleteLetters {

    public static void main(String[] args) {
        // Write a program that deletes the letters 'a' from the names in the list given as input.
        //         INPUT :      list1={"Ali","Veli","Ayse","Fatma","Omer"}
        //         OUTPUT :     [Veli,Omer]
        List<String> names = new ArrayList<>(List.of("Ali","Veli","Ayse","Fatma","Omer"));
        for (int i = 0;i< names.size();i++){
            String newS = names.get(i).toLowerCase();
            if (names.get(i).equalsIgnoreCase(newS)){
                if (newS.contains("a")){
                    names.remove(i);
                    i--;
                }
            }
        }
        System.out.print("[");
        for(int i = 0;i<names.size();i++){
            if(i!=names.size()-1){
                System.out.print(names.get(i) + ",");
            } else{
                System.out.print(names.get(i) + "]");
            }
        }
    }
}
