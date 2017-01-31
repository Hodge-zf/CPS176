public class twoDimArrayEx2{
public static void main(String[] args){
   int[][] nuM = { {1, 2, 3, 4 }, 
                   {5, 6, 7, 8}, 
                   {9, 10, 11, 12},
                   {13, 14, 15, 16},
                   {17, 18, 19, 20} };
   int total = 0;
   for (int row = 0; row < nuM.length; row++)
   
      for (int col = 0; col < nuM[row].length; col++)
         total += nuM[row][col];
     
      System.out.println("The total is "+total);
      
   }
}