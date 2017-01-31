//------------------Randy Hodge - CPS 176----------------------
//------------------Mayada Alani-------------------------------
//------------------Project 3---------------------------------- 
//------------------10/11/16-----------------------------------
import java.util.Scanner;

public class PizzaOrder{
   public static void main (String args[]){
   
   
   //Task 1 + 6 (throughout)
   //Setup, initialization, formatting
      
   Scanner keyboard = new Scanner (System.in);
   String fName;
   int inch;
   double initC;
   boolean nameS;
   double discC;
   String crustS;
   char crustT;
   System.out.print("\nEnter your first name:");
   fName = keyboard.nextLine();
   System.out.print("Welcome to Mike and Diane's Pizza, " + fName+"!");
   
   System.out.print("\nPizza Size (inches)   Cost");
   System.out.print("\n       10             $10.99");
   System.out.print("\n       12             $12.99");
   System.out.print("\n       14             $14.99");
   System.out.print("\n       16             $16.99");
   
   System.out.print("\nWhat size pizza would you like?");
   System.out.print("\n10, 12, 14, 16 (enter the number only): ");
   inch = keyboard.nextInt();
   
   //Task 2
   //Utilizing the "if-else-if" statement
   
   if (inch == 16){
      initC = 16.99;
   }else if (inch == 14){ 
      initC = 14.99;
   }else if (inch == 12){
      initC = 12.99;
   }else if (inch == 10){
      initC = 10.99;
   }else{
      initC = 12.99;
      System.out.println("No option selected. Defaulted to 12 inches.");
      }
   System.out.print("Base total so far: $"+initC);
   
   //Task 3
   //Switch statements
   
   Scanner kboard = new Scanner (System.in);
   String cType;
   System.out.print("\nWhat type of crust do you want?");
   System.out.print("\n(H)Hand-tossed, (T) Thin-crust, ");
   System.out.print("or (D) Deep-dish (enter H, T, or D):");
   crustS = kboard.nextLine();
   crustT = crustS.charAt(0);
   
  
   switch (crustT) {
      case 'H':cType = "Hand-tossed";
              break;
      case 'h':cType = "Hand-tossed";
              break;  
      case 'T':cType = "Thin-crust";
              break;      
      case 't':cType = "Thin-crust";
              break;
      case 'D':cType = "Deep-dish";
              break;
      case 'd':cType = "Deep-dish";
              break;
      default:cType = "Hand-tossed";
              System.out.print("\nNo option selected. Defaulted to Hand-tossed");
              break;
      }
   
   //Task 1 (continued)
   //Comparing characters using "if" statements
   
   System.out.println("\nAll pizzas come with cheese");
   System.out.println("Additional toppings are $1.25 each. Choose from: ");
   System.out.println("Pepperoni, Sausage, Onion, & Mushroom");
  
   
   System.out.println("Do you want pepperoni? Y/N: ");
   String pepYn = kboard.nextLine();
   char pepChar = pepYn.charAt(0);
   System.out.println("Do you want sausage? Y/N: ");
   String sausYn = kboard.nextLine();
   char sausChar = sausYn.charAt(0);
   System.out.println("Do you want onion? Y/N: ");
   String onionYn = kboard.nextLine();
   char onionChar = onionYn.charAt(0);
   System.out.println("Do you want mushroom? Y/N: ");
   String mushYn = kboard.nextLine();
   char mushChar = mushYn.charAt(0);
   
   
   
   if (pepChar == 'Y' || pepChar == 'y'){
      initC +=1.25;
    
   }
   if (sausChar == 'Y' || sausChar == 'y'){
      initC +=1.25;
      
   }
   if (onionChar == 'Y' || onionChar == 'y'){
      initC +=1.25;
      
   }
   if (mushChar == 'Y' || mushChar == 'y'){
      initC +=1.25;
      
   }
  

   System.out.println("Your order is as follows:");
   System.out.println(inch + "in pizza");
   System.out.println(cType);
   System.out.println("Pepperoni: "+pepChar+", Sausage: "+sausChar+", Onion: "+onionChar+", Mushroom: "+mushChar); 
   System.out.println("The cost of your order is $" + initC);
   double sTax = (initC*0.0625);
   System.out.println("Sales tax: "+sTax);
   System.out.println("Checking for applicable coupons........");
   
   //Tasks 4 + 5
   //Comparing strings, using flags
   String own1 = new String("Mike");
   String own2 = new String("Diane");
   
   nameS = fName.equalsIgnoreCase(own1);
   if (nameS == true){
      discC = initC - 2.00;
      System.out.print("\nCongratulations, you qualify for our discount!");
   }else{
      discC = initC;
      }
   nameS = fName.equalsIgnoreCase(own2);
   if (nameS == true){
      discC = initC - 2.00;
      System.out.print("\nCongratulations, you qualify for our discount!");
   }else{
      discC = initC;
      System.out.print("\nSorry, no discounts could be applied at this time.");
      }
   
   System.out.printf("\nYour total price will be $%.2f.\n ",discC+sTax);
   System.out.print("\nYour order will be ready in 30 minutes!");
   }
}

//notes


//The System.out.printf Method
//used for selecting decimal places 
//System.out.printf("Your pay is %.2f.\n:, grosspay");
//gives commas
//System.out.printf("Your pay is %,.2f.\n:, grosspay");
//indicates string usage
//System.out.printf("Your pay is %s.\n:, grosspay");
//Precedes number by 6 spaces
//System.out.printf("Your pay is %6d.\n:, grosspay");