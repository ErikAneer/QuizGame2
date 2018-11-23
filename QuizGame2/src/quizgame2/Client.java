
package quizgame2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class Client extends Application  {

    InetAddress ipAdress = InetAddress.getLocalHost();
    
    Stage window;

    @Override

    public void start(Stage primaryStage) throws UnknownHostException {

        window=primaryStage;


    }
    public Client() throws UnknownHostException{


        try (Socket socket = new Socket(ipAdress, 55555);
//             ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream()); // Använda istället för PrintWriter?
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());  
        ) {
            
            Object fromServer;
            String messageFromClient;
            String messageFromServer;
            
            //        window.setScene(new StartScene); // denna scen ska fråga efter spelar namn och skicka svaret till servern.



                 while ((fromServer = ois.readObject()) != null) {
                     
                       if (fromServer instanceof Initiator) {
                                                        System.out.println("Uppkopplad mot servern.");
                                                        System.out.println("Server: Vem vill du kolla upp?");
                                                }
                       else if (fromServer instanceof Response ) { // Vilka typer av objekt kan komma? Question. Category? Skapa Response-klass för väntaskärmar?
                                                          if (!((Response) fromServer).getSuccess()) {
                                                                System.out.println("Personen finns inte i databasen.");
                                                          }
                                                          else {
                                                                    System.out.println("Server: " + ((Response) fromServer).getPerson().getAddress());
                                                                    System.out.println("Server: Vem vill du kolla upp?");
                                                            }
                                                 }   
                
                        if(messageFromServer.equalsIgnoreCase("Väntar på kategori från motståndare")){
            //                    new WaitGui(messageFromServer);
                                messageFromClient = "";
                                out.write(messageFromClient);

                        }
                        if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("1")) { // Skapa välja kategori.
                                    /*
                                    new ChooseCategoryGui(objectOutputStream, messageFromServer); // OBS! Splitta inkommande sträng i GUI på underscore! 
                                    primaryStage.setScene(ChooseCategoryGUI);
                                    primaryStage.show();
                                    */
                        }
                        if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("2")) { // Skapa fråga
                                    /*
                                    new Questiongui(objectOutputStream, messageFromServer);
                                    primaryStage.setScene(Questiongui); 
                                    primaryStage.show();
                                    */
                        }

                        if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("3")) { // Skapa scen mellan ronder            
                                    /*
                                    new WaitBetweenRoundsGui(messageFromServer);                                   
                                    primaryStage.setScene(WaitBetweenRoundsGui); 
                                    primaryStage.show();
                                    */
                        }
                        if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("4")) { // Skapa scen spel klart.                    
                                    /*
                                    new ResultGui(objectOutputStream, messageFromServer);
                                    primaryStage.setScene(ResultGui); 
                                    primaryStage.show();
                                    */
                        }
                
//                messageFromClient = scan.nextLine();
//                objectOutputStream.writeObject(messageFromClient);
            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }catch (ClassNotFoundException e){
            e.getMessage();
        }




    }
}