 import java.util.*;
public class pro14
{                         //Program by VINAYAK MODI
    public static void main(String[] args)
    {
        Scanner hi=new Scanner(System.in);

        System.out.print("Enter binary number:");

       String a=hi.nextLine();     
              //Taking value as binary value
        int b=Integer.parseInt(a,2);  
            //converting value binary to decimal value
     
        System.out.print("Decimal number is:"+b);
 
    }
}