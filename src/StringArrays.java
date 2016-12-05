import java.util.Arrays;
        
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class StringArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String[] aryString = new String[5];
        
        aryString[0] = "This";
        aryString[1] = "is";
        aryString[2] = "a";
        aryString[3] = "string";
        aryString[4] = "array";
        
        Arrays.sort(aryString);
        
        int i;
        for (i=0; i < aryString.length; i++){
            System.out.println( aryString[i]);
        }
        
    }
}
