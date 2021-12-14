import java.util.*;
public class pro5
{                    //Program by VINAYAK MODI
      public static void main(String[] args)
    {
       
       Scanner pc = new Scanner(System.in);

       System.out.print("Enter the value of a:");
       int a=pc.nextInt();                            //taking value of first number a

       System.out.print("Enter the value of b:");
       int b=pc.nextInt();                              //taking value of ssecond number b

       System.out.print("Enter the value of c:");
       int c=pc.nextInt();                           //taking value of third number c

       if(a>b&&a>c)                             //comparing value of a from b and c
       {
         System.out.println("Number a is the largest :" +a);
       }
       else if(b>a&&b>c)                         //comparing value of b from a and c
       {
         System.out.println("Number b is the largest :" +b);
       }
       else
       {
         System.out.println("Number c is the largest :" +c);    //not a or b but the c is the largest
       }
    }
}