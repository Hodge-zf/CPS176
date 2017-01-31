public class Payroll2
{
   public static void main(String[] args)
   {
      int hour1 = 40;
      double grossPay1, payRate1 = 10.0;
      
      grossPay1 = hour1 * payRate1;
      System.out.println("If you work 40 hours a week, at a payrate of $" + payRate1);
      System.out.println("Pay1 is $" + grossPay1);
      
      int hour2 = 30;
      double grossPay2, payRate2 = 20.0;
      
      grossPay2 = hour2 * payRate2;
      System.out.println("If you work 30 hours a week, at a payrate of $" + payRate2);
      System.out.println("Pay2 is $" + grossPay2);
      
      int ovTime = 5;
      double grossPay3;
      
      grossPay3 = (hour1 * payRate1) + (payRate1 * 1.5 *(ovTime));
      System.out.println("If you work 45 hours a week, at a payrate of $" + payRate1);
      System.out.println("Pay3 is $" + grossPay3);
   
      double grossPay4;
      
      grossPay4 = (hour1 * payRate2) + (payRate2 * 1.5 *(ovTime));
      System.out.println("If you work 45 hours a week, at a payrate of $" + payRate2);
      System.out.println("Pay4 is $" + grossPay4);
   }
}