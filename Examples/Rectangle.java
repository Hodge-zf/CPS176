import java.util.*;
public class Rectangle{

   private double length;
   private double width;

public Rectangle(){
   length = 1.0;
   width = 1.0;}
      
public Rectangle(double len, double wid){
   length = len;
   width = wid;}   

public void setLength(double len){
   length = len;}

public void setWidth(double wid){
   width = wid;}
   
public double getLength(){
   Scanner kB = new Scanner(System.in);
   System.out.println("Enter length: ");
   double length = kB.nextDouble();
   kB.close(); 
   return length;}

public double getWidth(){
   Scanner kB = new Scanner(System.in);
   System.out.println("Enter width: ");
   double width = kB.nextDouble();
   kB.close(); 
   return width;}

public double getArea(){
   double area = length*width;
   return area;}



//needs werk   
/*public boolean squareCheck();
   boolean sq;
   
   if (EXPRESSION) 
   {
      ;
   }
   else
   {
      ;
   }
   return sq;*/
}

