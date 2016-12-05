import java.util.Arrays;
import java.util.Scanner;
        
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class ArraysTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner for input
       Scanner input = new Scanner(System.in);
       
       // create integer array with knwon values
       int[] myNums = {5,2,-3,10,7};
       
       // print array
       System.out.println("Array: "+ myNums);
       //
       for(int i = 0; i < 5; i++){
           System.out.println(myNums[i]);}
       
       int product = myNums[0] * myNums[1];
       myNums[2] = product;
       
       // array to store 5 marks
       double[] marks = new double[5];
       // get use input
       for(int i = 0; i < marks.length; i++){
           System.out.println("Please enter in mark " + (i+1));
           marks[i] = input.nextDouble();
       }
       
       // print array
       System.out.println("You enterd these marks");
       for(int i = 0; i < marks.length; i++){
           System.out.println(marks[i]);
       }
        
       double total = 0;
       for(int i = 0; i < marks.length; i++){
           total = total + marks[i];
       }
        double avg = total/marks.length;
        System.out.println("Average: " + avg);
        
       
    }
}
