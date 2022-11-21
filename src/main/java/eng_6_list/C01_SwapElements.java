package eng_6_list;

import java.util.ArrayList;
import java.util.List;

public class C01_SwapElements {

    public static void main(String[] args) {
        // Create a 10-element list. Swap the 8th element with the 3rd element.
        //INPUT :
        //String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        //Output:   [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]

        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String> list = new ArrayList<>(10);
        list.addAll(List.of(names));
        String temp = list.get(7);
        list.set(7,list.get(2));
        list.set(2,temp);
        System.out.print("[");
        for (int i = 0;i<list.size();i++){
            if (i!=list.size()-1){
                System.out.print(list.get(i)+",");
            } else {
                System.out.print(list.get(i)+"]");
            }
        }
    }
}
