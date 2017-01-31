import java.util.Scanner;

public class softSales{
   public static void main (String args[]){
   
   double quanT;
   double disC;
   Scanner kboard = new Scanner(System.in);

   System.out.println("Enter the quantity of packages desired: ");
   quanT = kboard.nextDouble();

   if (9<quanT && quanT<20){
     disC = 0.2;}
   else if (19<quanT && quanT<50){
     disC = 0.3;}
   else if (49<quanT && quanT<100){
     disC = 0.4;}
   else if (99<quanT){
     disC = 0.5;}
   else{ 
     disC = 0.0;}

   double baseP = quanT*99;
   double discP = baseP*disC;
   double totalP = baseP-discP;
   System.out.print("Your price, including all available discounts, comes to $"+totalP);
   }
}