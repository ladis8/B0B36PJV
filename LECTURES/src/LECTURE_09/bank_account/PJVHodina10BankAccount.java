package LECTURE_09.bank_account;

import java.util.ArrayList;
import java.util.List;


public class PJVHodina10BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        List<Person> persons = createPersons(10);
        
        double [] payments = new double[]{1, 2, 3, 1, 2, 3, 5, 3, 2};
        double [] bills = payments;
        
        Work work = new Work(persons, payments);
        Shop shop = new Shop(persons, bills);

        //interference - run stimulaeously
        work.payPayments();
        //wait until all other threads
        shop.makeCustomersPayBills();

        //run in main thread
        //all threads may not be finished yet
        printPersons(persons);
        
    }
    
    private static List<Person> createPersons(int countOfPersons){
        List<Person> persons = new ArrayList<>(countOfPersons);
        for(int i = 0; i < countOfPersons; i++){
            Person person  = new Person(new BankAccount(0), i);
            persons.add(person);
        }
        return persons;
    }
    
    private static void printPersons(List<Person> persons){
        for(Person person : persons){
            System.out.println(person.toString());
        }
    }
    
}
