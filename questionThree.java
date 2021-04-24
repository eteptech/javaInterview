
package interview;
import java.util.Scanner;
public class questionThree {
    //Method declaration for fibonacci series to accept number from user.
    public int fibonacci(int num){
        //Dclaring and initializing local variale
        int a=0,b=1;
        System.out.print("First "+num+" termrs: ");
        for(int i=1; i<=num; ++i){
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
        
     return num;   
    }
    public static void main(String agrs[]){
        int n= 10, t1=0,t2=1;
        System.out.println("First "+n+" terms: ");
        for (int i=1; i <=n; ++i){
            System.out.println(t1 +" ");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }
        //method call creating an object the class.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter desired number to print the series");
        //using try and catch block for users input error.
        try{
        int number=sc.nextInt();
        questionThree fc= new questionThree();
        fc.fibonacci(number);
        }catch(Exception e){
            System.out.println("Only integer number is accepted");
        }
    }
}
