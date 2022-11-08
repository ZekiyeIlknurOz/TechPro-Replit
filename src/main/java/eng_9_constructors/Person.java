package eng_9_constructors;

import java.util.Scanner;

public class Person {

    int score;
    static String word;
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void addB(String word) {
        this.word = word + this.word;
    }
    public void addE(String word){
        this.word += word;
    }

    public void addPoint(int score) {
        this.score += score;
    }

    void print(String name) {
        System.out.println("Invalid word, player " + name + " won the game ");
    }

    public String valid() {
        System.out.print("Valid or not [valid-not]: ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        return answer;
    }
}
