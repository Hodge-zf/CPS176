import java.util.Scanner;
public class Fbuzz{
     public static void main(String args[]){
     
     
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("Enter numeral");
     int n=keyboard.nextInt();
     for (int i=1;i<=n;i++)
     {
      if ((i%3==0)&&(i%5==0))
      System.out.println("FizzBuzz");   
      else if(i%3==0)
      System.out.println("Fizz");
      else if (i%5==0)
      System.out.println("Buzz");
      else System.out.println(i);
      }
   }
} 