package quizgame2;

import java.io.ObjectOutputStream;

public class ClientGUIFactory {

    ObjectOutputStream oos;

    ClientGUIFactory(ObjectOutputStream oos) {
        this.oos = oos;
    }

    public void handleInputFromServer(String messageFromServer) {
        if(messageFromServer.equalsIgnoreCase("Väntar på kategori från motståndare")){

        }
        else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("1")) {


        }
        else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("2")) { // Skapa fråga

        }

        else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("3")) { // Skapa scen mellan ronder

        }
        else if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("4")) { // Skapa scen spel klart.

        }
    }
}