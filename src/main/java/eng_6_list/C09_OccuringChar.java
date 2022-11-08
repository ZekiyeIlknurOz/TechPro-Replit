package eng_6_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_OccuringChar {
    //  Write a Java program to get a String from user as input and
    //  find the maximum occurring character in that string.(Ignore case sensitivity)
    //  Input : Learning java is easy         Output: maximum occurring character is : a
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        String str = input.nextLine().trim().replace(" ","");
        String[] s1 = str.split("");
        List<String> list1 = new ArrayList<>(List.of(s1));
        List<String> list2 = new ArrayList<>(list1);
        List<String> common = new ArrayList<>();
        List<Integer> commonSum = new ArrayList<>();
        int flag = 2;
        int count;
        for (int i = 0; i < list1.size(); i++) {
            count = 0;
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(i).equalsIgnoreCase(list2.get(j))) {
                    count++;
                }
            }
            if (count >= flag) {
                flag = count;
                if (!common.contains(list1.get(i))) {
                    common.add(list1.get(i));
                    commonSum.add(flag);
                }
            }
        }
        int maxOccuringChar = commonSum.get(commonSum.size()-1);
        System.out.print("maximum occurring character is : ");
        for (int i = 0;i<common.size();i++){
            if (commonSum.get(i)==maxOccuringChar){
                System.out.print(common.get(i) + " ");
            }
        }
    }
}
