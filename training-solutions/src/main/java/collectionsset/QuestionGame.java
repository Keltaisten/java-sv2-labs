package collectionsset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuestionGame {
    private List<RightAnswer> rightAnswers = new ArrayList<>();

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public List<RightAnswer> getRightAnswers() {
        return rightAnswers;
    }

    public Set<String> drawWinners(){
        Set<String> winners = new HashSet<>();
        int i = 0;
        while(winners.size() < 5){
            if(!winners.contains(rightAnswers.get(i).getNameOfTheWinner())){
                winners.add(rightAnswers.get(i).getNameOfTheWinner());
                rightAnswers.remove(i);
            }
            else{
                i++;
            }
            if(rightAnswers.isEmpty()){
                throw new IllegalArgumentException("Not enough right answers!");
            }

        }
        return winners;
    }
}
