package LECTURE_11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by ladislav on 12.5.17.
 */
public class TaskExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List <Task> tasks = new ArrayList<>();
        List <Future> futures = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
           tasks.add(new Task());
        }
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (Task t : tasks) {
            //submit vracit Future rozhrani, reprezentujici budouci vysledek
            // potrebuje Callable, ve kterem lze specifikovat navratovy typ
            futures.add(es.submit(t));

        }
        //future.get() nevraci nic, protoze pouzivame runnable x musime pouzivat callable
        //get je blokujici volani, cekam dokud neni run dokoncene
        //future.isDone() boolean if the task run method was already done
        for (Future f : futures){
           // System.out.println(f.isDone());
            System.out.println(f.get());
        }
    }
}
