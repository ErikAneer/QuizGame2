
package quizgame2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.Socket;


public class PlayerThread extends Thread {
                
         private Socket clientSocket;
         ActivePlayers activePlayersList;
   
         public PlayerThread(Socket clientSocket, ActivePlayers activePlayersList) {
                    this.clientSocket = clientSocket;
                    this.activePlayersList = activePlayersList;          
         }
         @Override
         public void run() {
             
                  try (     
                           ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
//                           ObjectInputStream ois = new ObjectInputStream((clientSocket.getInputStream())); // Använd istället för BR?
                            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));)
                         

                  {
                           PlayerProtocol p = new PlayerProtocol();
                           Player player = new Player(oos, in);
                           String inputLine;
                           
                           while ((inputLine =  in.readLine()) != null) {
                                    p.processInput(inputLine, activePlayersList, oos, in);
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