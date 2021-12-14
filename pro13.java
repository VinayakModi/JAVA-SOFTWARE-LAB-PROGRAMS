import java.util.*;
public class pro13
{                //Program by VINAYAK MODI
    public static void main(String[] args)
    {
        Scanner hi=new Scanner(System.in);
        System.out.print("Enter hexadecimal number:");
       String a=hi.nextLine();   
                            // input as hexadecimal number
        int b=Integer.parseInt(a,16);  
                       //converting base 16 value into decimal base
       String c=Integer.toBinaryString(b);  
               //now from base of decimal to binary number
        System.out.print("Binary numbers:"+c);
 
    }
}
        