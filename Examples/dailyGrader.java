import javax.swing.JOptionPane;

public class dailyGrader{
   public static void main(String args[]){
     
      String input = JOptionPane.showInputDialog("How many days do you have class this week?");
      int days=Integer.parseInt(input);
      double totalP = 0.0;
      for (int count = 1; count <= days; count++){
         input = JOptionPane.showInputDialog("Enter the grade for day "+count+":");
         double indvG = Double.parseDouble(input);
         totalP +=indvG;
      }
      double avgG = (totalP/days);
      JOptionPane.showMessageDialog(null, "Your grade average for the week is: "+avgG+"%");
      System.exit(0);
   }
}