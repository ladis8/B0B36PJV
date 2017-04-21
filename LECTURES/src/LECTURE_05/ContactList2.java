package LECTURE_05;

import java.util.*;

/**
 * Created by ladislav on 24/03/17.
 */
public class ContactList2 {

        private List<Contact> contacts;
        private int count;

        public ContactList2() {
            contacts = new ArrayList<Contact>();
            count = 0;

        }
        public void add(Contact c){
            contacts.add(c);
            count++;

        }
        public void add(String name, String surname, String phone, String address) {
            ///smart overloading ideas
            try{
                Contact c =  new Contact(name,surname,phone,address);
                add(c);
            }
            catch (Exception e){
                e.printStackTrace();
            }



        }
        public void sort(){
            //in order to avoid nullpointerexception


            //Collections.sort(contacts, new SurnameComparator());
            Collections.sort (contacts);

        }

        @Override
        public String toString() {
            String out = "";


            //out = contacts.stream().map((c)-> c.toString() + "\n" ).reduce(out,String);
            //First version


            /*for (Contact c : contacts){
                out+=c.toString();
            }*/

            Iterator<Contact> it = contacts.iterator();
            for (; it.hasNext();){
                out+=it.next().toString()+"\n";
            }

            /*for (int i = 0; i <count ; i++) {
                out+=contacts.get(i).toString();
                out+="\n";

            }*/
            return out;
        }

        /*class SurnameComparator implements Comparator <Contact>{
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        }*/


}
