import java.util.*;
public class pro16
{                              //Program by VINAYAK MODI
    public static void main(String[] args)
    {
        Scanner hi=new Scanner(System.in);
        System.out.print("Enter binary number:");
        
        //taking input as binary number 
       String a=hi.nextLine();
     
       //convert it to decimal value
        int b=Integer.parseInt(a,2);
       
        //now convert decimal  to hexadecimal
       String c=Integer.toHexString(b);
        System.out.print("Hexadecimal numbers:"+c);
 
    }
}