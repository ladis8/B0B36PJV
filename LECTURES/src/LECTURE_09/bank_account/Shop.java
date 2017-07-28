
package LECTURE_09.bank_account;

import java.util.ArrayList;
import java.util.List;


public class Shop {
    
    List<Person> customers;
    double [] bills;
    
    
    public Shop(List<Person> customers, double [] bills){
        this.customers = customers;
        this.bills = bills;
    }
    ///create separate thread for each customer
    public void makeCustomersPayBills() throws InterruptedException{
        List<Thread> threads = new ArrayList<>();

        //should add final because of anonymous class
         for(Person customer : customers){
            Thread t = new Thread(new Runnable() {
                 @Override
                 public void run() {
                     for(double payment : bills){
                         try {
                             customer.removeAmountFromBankAccount(payment);
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             });
            threads.add(t);
            t.start();
         }
         for (Thread t : threads){
             try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

         }
    }
    
}
