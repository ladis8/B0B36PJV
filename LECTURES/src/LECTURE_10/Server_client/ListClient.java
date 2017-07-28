package LECTURE_10.Server_client;

import java.io.*;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ladislav on 5.5.17.
 */
public class ListClient {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Socket client = new Socket("147.32.216.91", 3000);

        PrintWriter in = new PrintWriter(client.getOutputStream(), true);
        ObjectInputStream ois = new ObjectInputStream(client.getInputStream());

        in.println("GETBINARY");
        in.flush();
        List<Record> list = (List <Record>) ois.readObject();
        in.close();
        ois.close();

    }
}
