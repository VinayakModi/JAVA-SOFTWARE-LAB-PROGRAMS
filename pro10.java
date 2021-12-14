import java.util.*;
public class pro10
{                        //Program by VINAYAK MODI
    public static void main(String[] args)
    {
        
        Scanner pc=new Scanner(System.in);
        System.out.print("Enter the first term of Equation:");
        double a=pc.nextDouble();

        System.out.print("Enter the second term of Equation:");
        double b=pc.nextDouble();
       
        System.out.print("Enter the third term of Equation:");
        double c=pc.nextDouble();
         
        double D=(b*b)-(4*a*c);              //formula for 
         if (D>0)
         {
             double first_root=(-b+Math.sqrt(D))/(2*a);
             double second_root=(-b-Math.sqrt(D))/(2*a);
             System.out.println( "First Root of the Equation is"+ first_root);
             System.out.println( "Second Root of the Equation is"+ second_root);
         }

          else if (D==0){
            double equal_root=(-b+Math.sqrt(D))/(2*a);
            System.out.println( "Equal Roots is:"+ equal_root);
         }

        else
        {
        System.out.println( "Roots are imaginary.");
        }
    }
}