public class anotherArrayEx{
   public static void main(String[]args){
      int[] a1 = {2, 4, 6, 8, 10 };
      int[] a2 = {2, 4, 6, 8, 10 };
      boolean aE = true;
      int i = 0;
      
      if (a1.length != a2.length)
         aE = false;
      while (aE && i < a1.length)
         {if (a1[i] != a2[i])
            aE = false;
            i++;}
         if (aE)
            System.out.println("The arrays are equal.");
         else
            System.out.println("The arrays are not equal.");
       
           
      
  }
}