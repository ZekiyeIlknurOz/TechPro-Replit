package eng_9_constructors;

import java.util.Scanner;

public class C02_Students {
    /*
Create a student's variables in the main method and
use this assign variables create a method named Changename,
student as parameter get the information and change all the information in the method and
add the new information have it print
The line where we call the Rename method in the Main method is immediately then
reprint student information
Create a method named changesurname, this method is "lastname" as parameter get the variable.
In the method, ask the user to enter a new last name and change the old last name (i.e. can).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students std = new Students("Hakan", "Coskun");
        std.reName();

        System.out.print("Enter a new name: ");
        String name = input.next();
        std.changeName(name);
        std.reName();

        System.out.print("Enter a new last name: ");
        String surname = input.next();
        std.changesurname(surname);
        std.reName();

        input.close();
    }
}
