import java.util.Arrays;
        
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class ArraysTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aryNums;
        
        aryNums = new int[6];
        
        aryNums[0] = 10;
        aryNums[1] = 14;
        aryNums[2] = 36;
        aryNums[3] = 27;
        aryNums[4] = 43;
        aryNums[5] = 18;
     
        Arrays.sort(aryNums);
        
        int i;
        
        for (i=0; i < aryNums.length; i++) {
            System.out.println("num: " + aryNums[i]);
        }
        
    }
}
