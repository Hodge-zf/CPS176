//Randy Hodge
//CPS 176
//Mayada Alani
//Project 5

import java.util.*; 
import javax.swing.JOptionPane;

public class MethodsRandyHodge{
   public static void main(String args[]){ 
   
  
boolean conT;

do{

   Scanner kB = new Scanner(System.in);
   
   System.out.println("Input the first number: \n");
   if(kB.hasNext());
   double iX = kB.nextDouble();
   System.out.println("Input the second number: \n");
   double iY = kB.nextDouble();
   
   Printmenu();
   Scanner kBd = new Scanner(System.in);
  
   String inpT = kBd.nextLine();
   System.out.println("You chose to: "+inpT);
   
   
   
//Task #3 - Calling Methods     
   switch (inpT){
      case "add":
      case "Add":
         double iSum = sumM(iX, iY);
         System.out.println(iX+"+"+iY+" equals: "+iSum);
         break;
      case "subtract":
      case "Subtract":
         double iSub = subT(iX, iY);
         System.out.println(iX+"-"+iY+" equals: "+iSub);
         break;
      case "multiply":
      case "Multiply":
         double iMul = mulT(iX, iY);
         System.out.println(iX+"x"+iY+" equals: "+iMul);
         break;
      case "divide":
      case "Divide":
         double iDii = diiV(iX, iY);
         System.out.println(iX+"/"+iY+" equals: "+iDii);
         break;}
        
   		
   		
   		String anW =JOptionPane.showInputDialog("Perform another calculation? y/n: ");
   		
   		char anS = anW.charAt(0);
  
   		
   		if(anS == 'y')
   			conT = true;
   		else if(anS == 'Y')
   			conT = true;
   		else
   			conT = false;
	}while (conT); 
		
   }

   //Task #1 - Void Method
   public static void Printmenu(){
      
      System.out.println("This is a simple calculator");
      System.out.println("Choose what you would like to calculate: ");
      System.out.println("Addition: find the sum of two numbers");
      System.out.println("Subtraction: find difference of two numbers");
      System.out.println("Multiplication: find the product of two numbers");
      System.out.println("Division: The quotient of two numers");
      System.out.println("Add, subtract, multiply, or divide?: ");
      }
      
//Task #2 -  Value Returning Methods    
   public static double sumM(double A, double B){
   double sum=A + B;
   return sum;
}      
   public static double subT(double A, double B){
   double sub=A - B;
   return sub;
}
   public static double mulT(double A, double B){
   double mul=A * B;
   return mul;
}
   public static double diiV(double A, double B){
   double dii=A / B;
   return dii;
}
     
}   

/*         .__    _
           @ V; .Z~M
          || :|:@  d
          d' d\@  jf
   .*\   :P  #P  |P
   M `|  W  .@   Z
   | .b :!  d'  W'
   |  V W   #  .W**=m_
    |  !||   @  W'_   ~V;
    ||  M| _ Nm4| YmjL|PN_
     #   W#~    YN_W'YL#W#b
     |;  +       |f   `#'#8L
     W        ._#L_  .#,`'||
     |,     .WMP' ~Mm#`Nm;d|
     `|       W   Mmd#; .df
      |       M    `M#@-W'
      W       !b     WtZ'
      M        V;    |P
      ||        b   .@
       D        Y| .W'
      j|         'j@'
     jP'  L_mq=-_@'
   .Z!         jf
  mf         .W'
            .@'
[MONO]     .@'
          .@
         :@*/