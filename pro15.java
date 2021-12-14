import java.util.*;
public class pro15
{                        //Program by VINAYAK MODI
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the binary number:");

        //taking value binary from user
       String b=a.nextLine(); 

       //converting binary to decimal               
        int c=Integer.parseInt(b,2);

        //convert decimal to Octal value
       String d=Integer.toOctalString(c);

        System.out.print("Octal number is :"+d);
 
    }
}