/*
 * File name: Lab06.java
 * Date:      2014/08/26 21:39
 * Author:    @author
 */

package cz.cvut.fel.pjv;

import java.util.Scanner;

public class Lab02 {

   private TextIO input;

   public void start(String[] args) {
      if (args.length ==0 || (args[1] !="1" && args[1]!="2" &&args[1] !="3" && args[1] !="4")){
         homework();
      }


   }

   private void homework (){
      input = new TextIO();
      String line;
      int counter =0;
      int lines =0;
      double [] data = new double[10];

      while (!(line = input.getLine()).equals("")){
         lines++;
         if (input.isDouble(line)){
            data [counter] = Double.parseDouble(line);
            counter++;
            if (counter==10) {
               print(counter, data);
               counter =0;
            }
         }
         else{
            System.err.println("A number has not been parsed from line "+lines);
         }

      }
      System.err.println("End of input detected!");
      if (counter>1){
         print(counter,data);
      }
   }

   private void print (int counter, double [] data){
      System.out.printf("%2d %.3f %.3f\n", counter, average(counter, data), standardDeviation(counter,average(counter, data), data));
   }

   private double average (int c, double [] data){
      double sum =0;
      for (int i =0; i < c; i++){
         sum+=data[i];
      }
      return sum/c;
   }

   private double standardDeviation(int n, double average, double [] data){
      double sum =0;
      for (int i =0; i < n; i++){
         sum+= Math.pow(data[i] - average, 2);
      }
      return Math.sqrt(sum /n);
   }
}

/* end of HW02.Lab02.java */

