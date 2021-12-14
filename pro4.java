import java.util.*;
public class pro4
{                      //Program by VINAYAK MODI

      public static void main(String[] args)
    {
       
       Scanner hi = new Scanner(System.in);
       int a=hi.nextInt();             //taking value from user of a
       int b=hi.nextInt();             //taking value from user of b

       int mul=a*b;
       int diff=a-b;               //different operatins for two values of a and b
       int sum=a+b;
       int divi=a/b;

       System.out.println("Sum of a and b is:" +sum);
       System.out.println("Difference of a and b is:" +diff);
       System.out.println("Multiplication  of a and b is:" +mul);
       System.out.println("Division of a and b is:" +divi);
    }
}