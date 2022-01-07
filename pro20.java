                                 //Program by VINAYAK MODI
 import java.util.*;
public class pro20 {
    public static void main(String[] args) {
  
      int n, firstTerm = 0, secondTerm = 1;  //assinging value for first and second term
      Scanner sc =new Scanner(System.in);

      System.out.print("Enter a number till you want: ");
       n = sc.nextInt();   
       //taking input of the number till we want to find the fibonacci series 
      System.out.println("Fibonacci Series till " + n + " terms:");
  
      for (int i = 1; i <= n; ++i) {     
        System.out.print(firstTerm + ","); //loop from 1 to n
  
        // compute the next term
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
      }
    }
  }