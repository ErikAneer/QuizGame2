
package quizgame2;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class Game {
    
        Properties p = new Properties (); // In med properties för rounds och questionsPerRound. Se  övning Properties Sprint 4.
        private int player1Score, player2Score;
        private int rounds;
        private int questionsPerRound;
        private List<Question> roundQuestions = new ArrayList<>();
        private List<String> doneCategories = new ArrayList<>();

    
}
