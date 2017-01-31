import javax.swing.JOptionPane;
public class Ifexm{
   public static void main(String args[]){

   String testS;
   char letGrade;
   
   testS = JOptionPane.showInputDialog("Student's score?");
   double tScore = Double.parseDouble(testS);

   
   if (tScore >= 90){
      letGrade = 'A';
   }else if (tScore >= 80){ 
      letGrade = 'B';
   }else if (tScore >= 70){
      letGrade = 'C';
   }else if (tScore >= 60){
      letGrade = 'D';
   }else{
      letGrade = 'F';
   }
   System.out.print("Your score was " + tScore);
   System.out.print("\nGrade = "+ letGrade);
   System.exit(0);
   }
}