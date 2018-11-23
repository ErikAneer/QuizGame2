
package quizgame2;

import java.util.LinkedList;
import java.util.List;

public class ActivePlayers { // not in use currently. Meant to be used later if players want to switch opponent while active.

        private List<Player> activePlayersList = new LinkedList();

        public void addPlayer(Player playerToAdd) {
                activePlayersList.add(playerToAdd);
        }

        public void removePlayer(Player playerToRemove) {
                activePlayersList.remove(playerToRemove);
        }

        public List<Player> getPlayerList() {
                   return activePlayersList;
        }
        
        public Player findOpponent() {
               for (Player p : activePlayersList) {
                    if (p.checkAvailability()) {
                          p.setToNotAvailable();
                          return p;    
                    }
               }
                return null;
        }
}