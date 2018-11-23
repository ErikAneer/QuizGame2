
package quizgame2;

import java.io.BufferedReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Player {

        private String playerName;
        private boolean isAvailable = true;
        private int points;
        private ObjectOutputStream oos;
//        private ObjectInputStream ois;
        private BufferedReader in;
        

        Player(ObjectOutputStream oos, BufferedReader in)  {
//                this.playerName = playerName;
                this.in = in;
                this.oos = oos;

        }
        public void setPlayerName(String name) {
                playerName = name;
        }
        
        public void setPoints(int pointsToAdd) {
                points = points + pointsToAdd;

        }

        public void setToAvailable() {
                isAvailable = true;
        }

        public void setToNotAvailable() {
                isAvailable = false;
        }
        
        public boolean checkAvailability() {
                return isAvailable;
        }

        public ObjectOutputStream getOutputStream() {
                return oos;
        }

        public BufferedReader getInputReader() {
                return in;
        }

}