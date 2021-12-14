  //THIS PROGRAM BY VINAYAK MODI
import java.util.*;
public class pro11
{                   //Program by VINAYAK MODI
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter decimal numbers:");
        
        // taking input as decimal number
        int b=a.nextInt(); 
                              
        // converting integer to binary
         String c=Integer.toBinaryString(b); 
         
        System.out.print("Binary numbers:"+c);
 
    }
}