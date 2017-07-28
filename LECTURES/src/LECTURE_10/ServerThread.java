package LECTURE_10;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by ladislav on 5.5.17.
 */
public class ServerThread implements Runnable {

    private Socket client;
    public  ServerThread (Socket socket){
       client = socket;
    }
    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(client.getInputStream());
            System.out.println(client.getInetAddress()+":" + sc.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
