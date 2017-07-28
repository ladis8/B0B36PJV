package LECTURE_08.XML;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class SimpleXMLReader {

    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream(".LECTURES/src/LECTURE_08/XML/input.xml");
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser = factory.createXMLStreamReader(in);
        Person person = null;
        ArrayList<Person> persons = new ArrayList<>();
        while (parser.hasNext()) {
            int event = parser.next();
            if (event == XMLStreamConstants.START_ELEMENT) {

                switch (parser.getLocalName()){
                    case  "person":
                        person = new Person();
                        break;
                    case "name":
                        parser.next();
                        person.name = parser.getText();
                        break;
                    case "surname":
                        parser.next();
                        person.surname = parser.getText();
                        break;
                    case "phone":
                        parser.next();
                        person.phone = parser.getText();
                        break;
                }

            }
            else if (event == XMLStreamConstants.CHARACTERS){
            }
            else if (event == XMLStreamConstants.END_ELEMENT){
                if ("person".equals(parser.getLocalName())){
                   persons.add(person);
                }
            }

        }

        for (Person p : persons){
            System.out.println(p.name + " " + p.surname + " " + p.phone);
        }
    }


}

class Person{
    String name;
    String surname;
    String phone;
}
