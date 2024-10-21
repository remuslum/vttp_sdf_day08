package day08.project3;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Mastermind {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1111;
        int max = 6666;
        int answer = min + random.nextInt(max - min + 1);

        Console console = System.console();
        String guess = "";
        int numberOfGuesses = 0;
        
        while(numberOfGuesses < 12) {
            List<String> output = new ArrayList<>();
            guess = console.readLine("Make your guess: ");
            int guessInInt = Integer.parseInt(guess);
            if (guessInInt < 1111 || guessInInt > 6666) {
                System.out.println("You have entered an invalid number. Please enter a number between 1111 and 6666.");
            } else {
                if(Integer.parseInt(guess) == answer) {
                    System.out.println("You have won!");
                    break;
                } else {
                    String answerInString = String.valueOf(answer);
                    List<Character> answerList = answerInString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
                    List<Character> guessList = guess.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
                    for(int i = 0; i < guessList.size(); i++){
                        if(guessList.get(i).equals(answerList.get(i))){
                            output.add(i, "w");
                        } else if (answerList.contains(guessList.get(i))){
                            output.add(i, "b");
                        } else {
                            output.add(i, "r");
                        }
                    }
                }
                System.out.println(output);
                numberOfGuesses++; 
            }  
        }
        System.out.println(answer);
    }
}
