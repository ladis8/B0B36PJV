package LECTURE_10.Server_client;

import LECTURE_10.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ladislav on 5.5.17.
 */
public class ServerAttendence {
    List<Record> records= new ArrayList<>();


    public void addRecord(Record record){
        records.add(record);
    }

    public List<Record> getRecords (){
        return this.records;
    }


    public void run(){
        try {
            ServerSocket serversocket = new ServerSocket(3000);
            boolean run = true;
            while (run){
                new Thread(new ServerThread(serversocket.accept(),this)).start();

            }
            serversocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
      ServerAttendence server =  new ServerAttendence();
      server.run();
    }

}
