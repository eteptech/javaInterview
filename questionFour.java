
package interview;

import java.util.Scanner;

public class questionFour {
    public static void main(String agrs[]){
        //declaration and initialization of variables
        int n,i,j, count=0;
        //accepting input from user
        System.out.print("Enter a number\n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        System.out.println("Prime numbers from "+n+" 1 are: ");
        for(i=n; i>=0; i--){
            for(j=i/2;j>=1; j--){
                if(i%j==0 &&j!=1){
                    count=0;
                    break;
                }
                else
                count=1;
            }
            if(count == 1){
                System.out.print(" "+i);//Displaying the prime numbers
            }
        }
        
    }
    
}
