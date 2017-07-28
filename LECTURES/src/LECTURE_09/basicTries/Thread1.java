package LECTURE_09.basicTries;

/**
 * Created by ladislav on 28.4.17.
 */
public class Thread1 implements Runnable {
    @Override
    public void run() {
            for (int i = 1; i <10; i++) {

                System.out.println(Thread.currentThread().getName()+ ": cislo"+i);
            }
    }

}
