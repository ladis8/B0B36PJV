
package LECTURE_09.bank_account;

import java.util.ArrayList;
import java.util.List;


public class Work {    
    private List<Person> employees;
    private double [] payments; 
    
    public Work(List<Person> employees, double [] payments){
        this.employees = employees;
        this.payments = payments;
    }
    
    public void payPayments(){
        List<Thread> threads = new ArrayList<>();

        for(Person employee : employees){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(double payment : payments){
                        try {
                            employee.addAmountToBankAccount(payment);
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
