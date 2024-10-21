package day08.project3;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mastermind {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1111;
        int max = 6666;
        int answer = min + random.nextInt(max - min + 1);

        Console console = System.console();
        Parser parser = new Parser();
        Evaluator evaluator = new Evaluator();
        String guess = "";
        int numberOfGuesses = 0;
        
        while(numberOfGuesses < 12) {
            List<String> output = new ArrayList<>();
            guess = console.readLine("Make your guess: ");
            int guessInInt = parser.parse(guess);
            if (guessInInt == -1){
                continue;
            }
            else {
                if(guessInInt == answer) {
                    System.out.println("You have won!");
                    break;
                } else {
                    evaluator.evaluate(output, guess, String.valueOf(answer));
                }
                System.out.println(output);
                numberOfGuesses++; 
            }  
        }
        System.out.println(answer);
    }
}
