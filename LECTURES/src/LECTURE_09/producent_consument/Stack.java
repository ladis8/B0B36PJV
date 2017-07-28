
package LECTURE_09.producent_consument;


public interface Stack {
    
    public void add(String word) throws InterruptedException;
    public String pop() throws InterruptedException;
    public boolean isEmpty();
}
