package HW03;

public class CircularArrayQueue implements Queue {

    /**
     * Creates the queue with capacity set to the value of 5.
     */

    private int capacity;
    private String [] items;
    private int size;
    private int head;


    public CircularArrayQueue() {
        this.capacity =5;
        items = new String[capacity];
        head = size = 0;

    }
    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        this.capacity = capacity;
        items = new String[capacity];
        head = size= 0;

    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return ((size==0)? true: false);
    }

    @Override
    public boolean isFull() {
        return ((size ==capacity)? true: false);
    }

    @Override
    public boolean enqueue(String obj) {
        if (size < capacity){
            items [(head+size >= capacity)? size - (capacity-head): head+size] = obj;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public String dequeue() {
        if (size !=0){
            String item = items[head];
            head = (head +1 !=capacity)? head+=1 : 0;
            size--;
            return item ;
        }
        return null;
    }

    @Override
    public void printAllElements() {
        for (int i =0; i <size; i++){
                System.out.println(((head +i < capacity)? items[head+i]: items [head +i -capacity]));
        }

    }
}
