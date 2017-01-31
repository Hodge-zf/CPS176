   /*Randy Hodge, 9/13/2016*/
   /*CPS 176 - Mayada Alani*/
   import java.util.Scanner;
   import javax.swing.JOptionPane;
   public class Proj2 
{
   public static void main (String[] args)
   
      /*Task 1, purpose = Introduce math class*/

      {
      int diameter;
      Scanner kboard = new Scanner(System.in);
      System.out.print("\nWhat is the diameter? ");
      diameter = kboard.nextInt();
      int radius = diameter/2;
      double volume;
      volume = 4.0/3*Math.PI*Math.pow(radius,3);
              
      System.out.print("\nThe sphere has a volume of " + volume);
      
      /*Task 2, purpose = Introduce scanner class*/
      
      String fName;
      String lName;
      String full;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nWhat is your first name? ");
      fName = keyboard.nextLine();
      
      System.out.print("What is your last name? ");
      lName = keyboard.nextLine();
      full = fName + " " + lName;
      System.out.print(full);
      
      /*Task 3, purpose = Introduce charAt and length methods*/
      
      char fInit;
      fInit = fName.charAt(0);
      System.out.print("\n"+fInit);
      
      full = full.toUpperCase();
      System.out.print("\n"+full+"\n"); 
      System.out.print(full.length());
      
      /*Task 4, purpose = introduce jOptionPane & Dialogue Box*/
      
      String firstN;
      String lastN;
      String fullN;
      firstN = JOptionPane.showInputDialog("Your first name?"); 
      lastN = JOptionPane.showInputDialog("Your last name?");
      fullN = firstN + " " + lastN;
      JOptionPane.showMessageDialog(null, fullN);
      
      }
}
      
      