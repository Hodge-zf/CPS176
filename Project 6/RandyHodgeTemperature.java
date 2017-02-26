//---------------------Randy Hodge
//------CPS 176-------------------
//------Mayada Alani--------------
//------Project 6------------------

import java.util.*;
public class RandyHodgeTemperature {
	public static void main(String[]mxno){
	
	
		int[] ftemp= new int[5]; //declare and create an array of size 5 called ftemp
		enterTemps(ftemp); //Add a line in the main method that calls the enterTemps method.
		int[] ctemp = Celsius(ftemp);
		System.out.println("Temperature for day  0"+" = "+ctemp[0]+"C");
		System.out.println("Temperature for day  1"+" = "+ctemp[1]+"C");
		System.out.println("Temperature for day  2"+" = "+ctemp[2]+"C");
		System.out.println("Temperature for day  3"+" = "+ctemp[3]+"C");
		System.out.println("Temperature for day  4"+" = "+ctemp[4]+"C");
	}
	public static void enterTemps(int[] nuM){ //Write a static method that takes your array as its parameter and does not return a value
		Scanner kB = new Scanner(System.in);
		   
		   int cT = 0;
		   
		   while (cT < 5){
		      System.out.println("Enter a temperature: ");
		      nuM[cT] = kB.nextInt();
		      System.out.println("Temperature for day "+cT+" = "+nuM[cT]+"F");
		      cT++;}
		   
		   			
	}
	//Write a static method called Celsius that takes in one element of your array at a time that represents the Fahrenheit temperature and returns the Celsius temperature
	
	public static int[] Celsius(int[] fin){ 
      int[] cOut = new int[5];
		int cT = 0; 
		   while (cT < cOut.length){
            cOut[cT] = (5*fin[cT]/9-32);
            cT++;}
      return cOut;
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