package LECTURE_09.producent_consument;

import java.util.List;

/**
 * Created by ladislav on 28.4.17.
 */
public class Stackimpl implements Stack {
    //private java.util.Stack <String> stack = new java.util.Stack<String>();
    private final int STACKSIZE =5;
    private String[]  stack = new String[STACKSIZE];
    private int head;

    @Override
    //deadlock
    //- one thred wait when stack is full until a producent takes a word
    //- but it is synchronised - pop can not because it is locked
    public synchronized void add(String word) {
       //stack.push(word)
        /*while (isFull()){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        */
        //synchronized (this){
        while (isFull()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            stack [++head]= word;
            notifyAll();
        //}
    }

    @Override
    public synchronized String pop() throws InterruptedException {
        /*while (isEmpty()){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        */
        while (isEmpty()){
                wait();
        }
        String word;
        word = stack[head];
        head--;

        notifyAll();
        return word;

    }


    public synchronized boolean isEmpty() {
        return head <0;
    }
    public synchronized boolean isFull(){
        return head +1 >=STACKSIZE;
    }
}
