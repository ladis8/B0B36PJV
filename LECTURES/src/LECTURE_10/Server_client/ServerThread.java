package LECTURE_10.Server_client;

import LECTURE_10.Client;
import com.sun.org.apache.regexp.internal.RE;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by ladislav on 5.5.17.
 */
public class ServerThread implements Runnable {

    private Socket client;
    private ServerAttendence server;
    public ServerThread(Socket socket, ServerAttendence server){
       client = socket;
       this.server = server;
    }
    @Override
    public void run() {
        try {

            Scanner sc = new Scanner(client.getInputStream());
            PrintWriter out = new PrintWriter(client.getOutputStream());
            ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());

            String cmd;
            Record record = new Record();

            boolean run = true;

          //obsluha protokolu
            while (run && (cmd = sc.nextLine()) != null ){
                System.out.println(cmd);
                int s = cmd.indexOf(" ");
                System.out.println(s);
                String command;
                String rest;

                if (s != -1 ){
                    command =  cmd.substring(0, s);
                    rest = cmd.substring(s+1);
                }
                else {
                    command = cmd;
                    rest = "";
                }


                switch (command){
                    case "HELLO":
                        record.name = rest;
                        System.out.println(rest);
                        out.println("OK");
                        break;

                    case "GET":
                        for (Record r: server.getRecords()){
                            out.println(r);
                            System.out.println(r);
                        }
                        out.println("OK");
                        break;
                    case "ID":
                        record.id = Long.parseLong(rest);
                        out.println("OK");
                        break;
                    case "EVENT":
                        record.place= rest;
                        out.println("OK");
                        break;
                    case "ENTRY":
                        record.entrty = true;
                        out.println("OK");
                        break;
                    case "EXIT":
                        record.entrty = false;
                        out.println("OK");
                        break;
                    case "GETBINARY":
                        oos.writeObject(server.getRecords());
                        oos.flush();
                        out.println("OK");
                        break;
                    default:
                        run = false;
                        break;

                }
                out.flush();
                if (!run){
                    break;
                }

            }

            server.addRecord(record);
            System.out.println("Record was created");
            //System.out.println(client.getInetAddress()+":" + sc.nextLine());
            out.print("BYE");
            client.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
