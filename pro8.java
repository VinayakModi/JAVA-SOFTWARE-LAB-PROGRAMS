import java.util.*;
import java.lang.Math;
public class pro8
{                           //Program by VINAYAK MODI
      public static void main(String[] args)
    {
       
       Scanner pc = new Scanner(System.in);

       System.out.print("Enter the value of a:");
       int a=pc.nextInt();                             //taking value of first number a    

       System.out.print("Enter the value of b:");
       int b=pc.nextInt();                           //taking value of ssecond number b

       System.out.print("Enter the value of c:");
       int c=pc.nextInt();                           //taking value of third number c
      
       int d=Math.min(a,b);                               //using Inbulit function for minimum number 
       int e=Math.min(d,c);                             //using Inbulit function for minimum number 
      
       if(a==b&&a==c)         //comparing value of a to b and c  
       {
           //values are equal
         System.out.println("All the numbers Are Equal.");
       }
      
       else
       {
              //smallest number is
         System.out.println( "Is the Smallest Number:"+e);
       }
    }
}