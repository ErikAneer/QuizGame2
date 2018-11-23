
package quizgame2;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {
        
             public static void main (String [] args ) throws IOException {
                    System.out.println("Server Listener up and running.");
                    ServerSocket serverSocket = new ServerSocket(44444);
                    ActivePlayers activePlayersList = new ActivePlayers();
                    QuestionCollection questionCollection =  new QuestionCollection();
                    
                    while (true) {
                             try {
                                       final Socket socketToClient = serverSocket.accept();
                                       PlayerThread playerThread = new PlayerThread(socketToClient, activePlayersList, questionCollection);
                                       playerThread.start();
                                       System.out.println("Player thread created.");
                             }
                             catch (IOException e) {e.printStackTrace();}
                    } // end while        
          }
}
