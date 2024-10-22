package day08.project3;

import java.util.List;
import java.util.stream.Collectors;

public class Evaluator {
    public Evaluator() {

    }

    public void evaluate(List<Integer> rightDigitsCounter, String guess, String answer){
        List<Character> answerList = answer.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> guessList = guess.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        for(int i = 0; i < guessList.size(); i++){
            if(guessList.get(i).equals(answerList.get(i))){
                rightDigitsCounter.add(0, rightDigitsCounter.get(0) + 1);
            } else if (answerList.contains(guessList.get(i))){
                rightDigitsCounter.add(1, rightDigitsCounter.get(1) + 1);
            } else {
                System.out.printf("This digit %s is not present in the number \n", guessList.get(i));
            }
        }
    }
}
