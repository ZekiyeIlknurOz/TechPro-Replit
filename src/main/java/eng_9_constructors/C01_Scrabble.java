package eng_9_constructors;

import java.util.Scanner;

public class C01_Scrabble {
    // Write a Scrabble Game for two person
    // Rules
    //OK 1- At the beginning Ask to first Player enter a word for starting game
    //OK 2- Then change the player ask to new player if given word is valid or not
    //OK    i)  If new player accepts the given word add number of letters in the word
    //          as points to player who wrote the word And go to step 3
    //OK    ii) If new player  does not accept the word as valid then print
    //          "Invalid word, player X(Current player) won the game" and finish the game
    //
    //OK 3- Ask to users if user want to continue game or not
    //OK    i)  If player want to continue,
    //OK        ask to user a letter to add to word
    //OK        and ask to user side to add (beginning or end)
    //OK        then add letter to word and run step 2
    //
    //OK    ii) If player does not want to continue
    //  then print "Game Finished" and print points  and winner
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person p1 = new Person("Hakan");
        Person p2 = new Person("Elif");
        System.out.print("Enter a word: ");
        String word = input.next();
        String reply = p2.valid();
        if (reply.equals("valid")) {
            p1.addPoint(word.length());
            System.out.println(p2.name + " want to continue (Y/N)");
            String c = input.next().substring(0,1);
            if (c.equalsIgnoreCase("y")){
                System.out.print("Enter a word: ");
                word = input.next();
                System.out.print("add (beginning or end): (B/E)");
                String str = input.nextLine();
                /*
                if(str.equalsIgnoreCase("B")){

                }
                 */
            }
        } else if (reply.equals("not")) {
            p2.print(p2.name);

        }
        System.out.println(p1.score);
        System.out.println(p2.score);
    }
}
