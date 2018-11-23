
package quizgame2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.Socket;


public class PlayerThread extends Thread {
                
         private Socket clientSocket;
         ActivePlayers activePlayersList;
         QuestionCollection questionCollection;
        
   
         public PlayerThread(Socket clientSocket, ActivePlayers activePlayersList, QuestionCollection questionCollection) {
                    this.clientSocket = clientSocket;
                    this.activePlayersList = activePlayersList;         
                    this.questionCollection = questionCollection;
         }
         @Override
         public void run() {
             
                  try (     
                           ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
                           ObjectInputStream ois = new ObjectInputStream((clientSocket.getInputStream())); 
                           )
                         

                  {
                           PlayerProtocol p = new PlayerProtocol();
                           Player player = new Player(oos, ois);
                           String inputLine;
                           
                           
                           while ((inputLine = (String) ois.readObject()) != null ) {
//                                    p.processInput(inputLine, activePlayersList, oos, ois);
                           }  // end while
                  }  
                  catch (Exception e) {
                        e.printStackTrace();
                  }
         }
             
//             public String sendMessage(String message) {
//                         return message;
//         }
}