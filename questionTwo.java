
package interview;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author era
 */
//Amaka's birthday array.
public class questionTwo {
   private int encodeInteger(int x, int n){
        n=n<<(1<<(1<<1));
        x=x|n;
        System.out.print(x);
        return x;
    }
    private void encodeArray(int []A,int []B, int n){
        for(int i=0;i<n;i++){
            A[i]=encodeInteger(A[i], B[i]);
            System.out.println("here is your array elements Amaka: "+A+n); 
        }   
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        questionTwo qt=new questionTwo();
        System.out.println("Enter your array here Amaka:");
        int totalArr=sc.nextInt();
        System.out.println("Enter your first array here Amaka:");
        int firstBd=sc.nextInt();
        System.out.println("Enter your second  array here Amaka:");
        int secondBd=sc.nextInt();
        firstBd=sc.nextInt();
        int[]A =new int[firstBd];
        int[]B =new int[secondBd];
        try{
        qt.encodeArray(A, B, totalArr);
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        
        
        /*int n;
        System.out.print("Enter size of array : ");
        n=sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i < n; i++){
            System.out.println("Enter array ["+i+"] ");
            arr[i]=sc.nextLine();
            
        }
        System.out.println("The array elements are: ");
        for (int i =0 ; i < arr.length; i++){
            System.out.println("Array ["+i+"] "+arr[i]);
        }*/
        /*int len, p,e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter "+len+" all the elements:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert an element:");
        p = sc.nextInt();
        System.out.print("Enter the element which you want to insert:");
        e = sc.nextInt();
        for(int i = len-1; i >= (p-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[p-1] = e;
        System.out.print("After inserting : ");
        for(int i = 0; i <=len; i++)
        {
            System.out.print(arr[i]+",");
        }*/
        
    }
    
}
