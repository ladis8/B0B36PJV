package LECTURE_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by ladislav on 5.5.17.
 */
public class Client {

    public static void main(String[] args) throws IOException {
        Socket clientsocket = new Socket("192.168.0.81",12345);
        //clientsocket.connect(clientsocket);
        PrintWriter out = new PrintWriter(clientsocket.getOutputStream(), true);
        out.print("hello");
        System.out.println("sent");
        BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
        System.out.println(in.readLine());

    }
}
