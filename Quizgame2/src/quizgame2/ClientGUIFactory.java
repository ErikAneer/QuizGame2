package quizgame2;

import java.io.ObjectOutputStream;

public class ClientGUIFactory {

        ObjectOutputStream oos;
//        ClientGUI clientgui = new ClientGUI(oos);

        ClientGUIFactory(ObjectOutputStream oos) {
            this.oos = oos;
        }

        public void handleInputFromServer(String messageFromServer) {
                    if(messageFromServer.substring(0, 1).trim().equalsIgnoreCase("0")){ //fått koppling med servern. Visa startskärm för att kunna skicka namn till servern.

                    }
                    else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("1")) { // Väntar på motståndare // väntar på motståndare väljer kategori.


                    }
                    else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("2")) { // Välja kategori.

                    }

                    else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("3")) { // Svara fråga / frågeGUI

                    }
                    else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("4")) { // Skapa scen rondpaus / spel klart.

                    }
                    // Någon mer scen?
        }
}