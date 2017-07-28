package LECTURE_09.basicTries;

/**
 * Created by ladislav on 28.4.17.
 */
public class MainThread {
    public static void main(String[] args) {
        Runnable r1 = new Thread1();
        Runnable r2 = new Thread1();
        Runnable r3 = new Thread1();
        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
        System.out.println("Main Thread is working...");
    }
}
