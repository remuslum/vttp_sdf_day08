package day08.project3;

import java.util.List;
import java.util.stream.Collectors;

public class Evaluator {
    public Evaluator() {

    }

    public void evaluate(List<String> output, String guess, String answer){
        List<Character> answerList = answer.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
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
}
