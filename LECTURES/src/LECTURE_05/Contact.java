package LECTURE_05;

/**
 * Created by ladislav on 24/03/17.
 */
public class Contact implements Comparable<Contact>{

    private String name;
    private String surname;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws Exception {
        if ("".equals(phone)){
            throw new Exception("Wrong format of phone number");
        }
        this.phone = phone;

    }

    public Contact(String name, String surname, String address, String phone) throws Exception {

        this.name = name;
        this.surname = surname;
        this.address = address;
        setPhone(phone);
    }

    public String toString(){
        return surname +" " +name+" "+phone+" "+ address;
    }




    @Override
    public int compareTo(Contact o) {
        if (this.surname.compareTo(o.surname) == 0){
            return (this.name.compareTo(o.name));
        }
        return this.surname.compareTo(o.surname);


        ///comparing based on surnames
        /*if (this.surname<o.surname){
            return -1;
        }
        else if(this.surname== o.surname){
            return 0;
        }
        else{
            return 1;
        }*/
    }

}
