package LECTURE_10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by ladislav on 5.5.17.
 */
public class Server {

    public static void main(String[] args) throws IOException {
        //port must be specified
        ServerSocket ss = new ServerSocket(2000);

        boolean x = true;
        while (x){

            //waits for connection
            Socket client = ss.accept();
            new Thread(new ServerThread(client)).start();

        }
        ss.close();

    }
}
