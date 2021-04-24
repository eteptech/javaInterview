
package interview;

//Java Program to Find the Smallest Positive Integer Missing in
//an Unsorted Integer Array
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class questionOne {
    // Function to find the smallest positive missing integer
    static int findMissingInt(int[] array){
        Arrays.sort(array);
        int j,i = 1;
        for(j = 0; j<array.length; j++){
           if(array[j] == i){
              i++;
           }
        } 
        return i;
    }
    // Function to read input and display the output
    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try {
            size = Integer.parseInt(buffer.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        //getting the size of array.
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(buffer.readLine());
            } catch (Exception e) {
                System.out.println("An error occurred, Please try again.");
                return;
            }
        }
        int missing = findMissingInt(array);
        System.out.println("The smallest positive missing integer is: " + missing);
    }
}
