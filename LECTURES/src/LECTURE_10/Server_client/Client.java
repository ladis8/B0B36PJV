package LECTURE_10.Server_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.BufferOverflowException;
import java.util.Scanner;

/**
 * Created by ladislav on 5.5.17.
 */
public class Client {



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Socket client = new Socket("147.32.216.91", 3000);

        PrintWriter in = new PrintWriter(client.getOutputStream(), true);
        BufferedReader rd = new BufferedReader(new InputStreamReader(client.getInputStream()));


        while (true){
            in.println(sc.nextLine());
            in.flush();
            System.out.println(rd.readLine());

        }


    }
}
