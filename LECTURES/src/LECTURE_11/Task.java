package LECTURE_11;

import LECTURE_07.main.java.cz.cvut.fel.pjv.testing.Calculator;

import java.util.concurrent.Callable;

/**
 * Created by ladislav on 12.5.17.
 */
public class Task implements Callable <Integer>{
    //@Override
    public void run() {
       for (int i = 1; i<= 10; i++){
           System.out.println(Thread.currentThread().getName() +":" +i);
           try {
               Thread.sleep((long) Math.random() *10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }

    @Override
    public Integer call() throws Exception {
        for (int i = 1; i<= 10; i++){
                System.out.println(Thread.currentThread().getName() +":" +i);
                try {
                    Thread.sleep((long) Math.random() *10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return 1;
    }
}
