package LECTURE_03.cvut.cz.pjv.utils;

/**
 * Created by ladislav on 10/03/17.
 */
public abstract class ArrayUtil{


    public static <T extends Comparable<T>> void sort(T[] objects){
        for (int i = 0; i < objects.length - 1; i++) {
            for (int j = 0; j < objects.length-i-1; j++) {
                if (objects[j+1].compareTo(objects[j])< 0){ //next item is smaller than current item -> swap
                    T temp = objects[j];
                    objects[j] = objects[j+1];
                    objects[j+1] = temp;
                }
            }
        }

    }




}
