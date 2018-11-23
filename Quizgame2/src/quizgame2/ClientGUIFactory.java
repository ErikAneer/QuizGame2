package quizgame2;

import java.io.ObjectOutputStream;

public class ClientGUIFactory {

        ObjectOutputStream oos;
        ClientGui clientgui = new ClientGui(oos);

        ClientGUIFactory(ObjectOutputStream oos) {
            this.oos = oos;
        }

        public void handleInputFromServer(String messageFromServer) {
                    if(messageFromServer.substring(0, 1).trim().equalsIgnoreCase("0")){ //fått koppling med servern. Visa startskärm för att kunna skicka namn till servern.
                              clientgui.showStartScene();
                    }
                    else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("1")) { // Väntar på motståndare // väntar på motståndare väljer kategori.
                              clientgui.showWaitScene();
                    }
                    else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("2")) { // Välja kategori.
                              clientgui.showCategoryScene();
                    }

                    else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("3")) { // Svara fråga / frågeGUI
                              clientgui.showQuestionScene();
                    }
                    else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("4")) { // Skapa scen rondpaus / spel klart.
                              clientgui.showEndScene();
                    }
                    // Någon mer scen?
        }
}