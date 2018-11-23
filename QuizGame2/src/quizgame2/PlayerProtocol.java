
package quizgame2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;


public class PlayerProtocol {
    
          private static final int BEFORE_INIT = 0;
          private static final int WAITING_FOR_REQUEST = 1; 
          private static int WAITING_FOR_OTHER_PLAYER = 2;
          private static int OTHER_PLAYER_FOUND = 3;
          private static int CHOOSE_QUESTION_CATEGORY = 4;
          private static int WAITING_FOR_OTHER_PLAYER_TO_CHOOSE_CATEGORY = 5;   
          private static int SENT_QUESTION = 6;
          private static int ROUND_BREAK = 7;
          private static int GAME_FINISHED = 8;
          private static int FIND_NEW_OPPONENT = 9;
          private static int QUIT;
          
          private Player player;
          private Player Opponent;
          private int state = BEFORE_INIT;
          private int completedQuestions;
          ActivePlayers activePlayersList;
        
         public void processInput(String input, ActivePlayers activePlayersList, ObjectOutputStream oos, BufferedReader in) {
                    
                    String output ="";
                   
                    if (state == BEFORE_INIT) { 
                              output = "Welcome";    
//                              d.addUser(p);
//                              d.sendMessage(output, p); 
                              state = WAITING_FOR_REQUEST;   
                    }
                    else if (state == WAITING_FOR_REQUEST) {
                              if (input.matches("NEDKOPPLAD")) {
//                                        d.removeUser(p);
//                                        p.close();
                                        try {
                                                   in.close();
                                        } catch (IOException ex) {
                                                    ex.printStackTrace();
                                        }
                              }
                              else {
//                                        d.sendMessageToAll(input); 
                              }           
                    }
          }
    
}

// Player opponent = activePlayersList.findOpponent();
//                           if (opponent == null) 