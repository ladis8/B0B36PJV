package LECTURE_08;

import java.io.Serializable;

/**
 * Created by ladislav on 21.4.17.
 */
public class Contact implements Serializable {

    public String name;
    public String position;
    public String desc;
    public String doornumber;

    public Contact(String name, String  position, String desc, String doornumber) {
        this.name = name;
        this.position = position;
        this.desc= desc;
        this.doornumber = doornumber;
    }

    @Override
    public String toString() {
        return name + " "+ position + " " + desc + " " + doornumber;
    }
}
