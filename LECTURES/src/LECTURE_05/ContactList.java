package LECTURE_05;

import java.util.Arrays;

/**
 * Created by ladislav on 24/03/17.
 */
public class ContactList {

    private Contact[] contacts;
    private int count;
    private int size;

    public ContactList(int size) {
        contacts = new Contact[size];
        this.size=size;
        count = 0;

    }
    public void add(Contact c) throws ContactListFullException{
        if (count==size){
            throw new ContactListFullException("Contact list is full");

        }
        contacts[count] = c;
        count++;

    }
    public void add(String name, String surname, String phone, String address)
            throws ContactListFullException, Exception{
        ///smart overloading ideas
        Contact c =  new Contact(name,surname,phone,address);
        add(c);

    }
    public void sort(){
        //in order to avoid nullpointerexception
        Arrays.sort(contacts,0,count);
    }

    @Override
    public String toString() {
        String out = "";
        /*for (Contact c : contacts){
            if (!(c.equals(null)))
                out+=c.toString();
        }*/
        for (int i = 0; i <count ; i++) {
            out+=contacts[i].toString();
            out+="\n";

        }
        return out;
    }
}
