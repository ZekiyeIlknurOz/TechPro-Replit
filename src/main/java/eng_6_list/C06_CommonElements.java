package eng_6_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_CommonElements {

    public static void main(String[] args) {
    // Write a program to find the common elements between two String Arrays(without case sensitivity)
    //Input1 : {John,Brad,Ange,Sofia,Emily}
    //Input2 : {sofia,brad,grace,emily,hazel}       /Output : [sofia,brad,emily]
        String input1[] =  {"John","Brad","Ange","Sofia","Emily"};
        String input2[] = {"sofia","brad","grace","emily","hazel"};
        List<String> list1 = new ArrayList<>(List.of(input1));
        List<String> list2 = new ArrayList<>(List.of(input2));
        List<String> commonList = new ArrayList<>();
        for (String w : list2){
            for (String t : list1){
                if (w.equalsIgnoreCase(t)){
                    commonList.add(w);
                }
            }
        }
        String arr[] = commonList.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        System.out.print("[");
        for (int i = 0;i<arr.length;i++){
            if (i==arr.length-1){
                System.out.print(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}
