package HW03;

import com.sun.media.sound.SoftTuning;

/**
 * @author Jirka Šebek
 */
public class Start {

    public static void main(String[] args) {

         
        /* homework */
       Queue queue = new CircularArrayQueue(5);

        for (int i = 0; i < 1000;i++){
            if (i%5 !=0){
                queue.enqueue(Integer.toString(i));
                System.out.println();
            }
            else{
                System.out.println("dequed: " +queue.dequeue());
            }
            queue.printAllElements();
        }

        queue.enqueue("Starkiller");
        queue.enqueue("C-3PO");
        queue.enqueue("Jabba the Hutt");
        queue.enqueue("HK-47");
        queue.enqueue("Darth Nihilus");
        queue.enqueue("Count Dooku");
        System.out.println("size: " + queue.size());
        System.out.println("Value dequeued from CircularArrayQueue: " + queue.dequeue());
        System.out.println("printing all elements: ");
        queue.printAllElements();
        queue.enqueue("Jango Fett");
        System.out.println("size: " + queue.size());
        queue.printAllElements();
        System.out.println();
        while (!(queue.isEmpty())){
            System.out.println(queue.dequeue());
        }
        System.out.println(queue.dequeue());
        queue.enqueue("Han Solo");
        queue.printAllElements();
    }
}
