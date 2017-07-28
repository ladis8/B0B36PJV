package LECTURE_10.Server_client;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by ladislav on 5.5.17.
 */
public class Record implements Serializable{

   public long id;
   public String name;
   public String place;
   public Date time;

   public Record(){
       super();
   }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", time=" + time +
                ", entrty=" + entrty +
                '}';
    }

    public Record(long id, String name, String place, Date time, boolean entrty) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.time = time;
        this.entrty = entrty;
    }

    public boolean entrty;



}
