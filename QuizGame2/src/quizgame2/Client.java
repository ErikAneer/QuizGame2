
package quizgame2;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
public class Client   {

    InetAddress ipAdress = InetAddress.getLocalHost();
    int socket = 55555;

    public Client() throws UnknownHostException {

        try (   Socket socketToServer = new Socket(ipAdress, socket);
                ObjectOutputStream oos = new ObjectOutputStream(socketToServer.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socketToServer.getInputStream());
        ) {

            String messageFromClient;  // behövs alls?
            String messageFromServer;
            ClientGUIFactory guiFactory = new ClientGUIFactory(oos);

            while(true) {
                if ((messageFromServer = (String) ois.readObject()) != null) {
                    System.out.println(messageFromServer);
                    guiFactory.handleInputFromServer(messageFromServer);
                }
            }
        } catch(IOException e){
            e.printStackTrace();

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
        System.out.println("hej");
    }
}