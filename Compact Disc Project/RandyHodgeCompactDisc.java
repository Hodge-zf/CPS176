import java.io.*;
import java.util.*;
public class RandyHodgeCompactDisc{
public static void main(String[] args)throws Exception{  
	  
    String t1 = "";
    String t2 = "";

    Scanner iF = new Scanner(new File("Classics.txt"));

    List<String> songs = new ArrayList<String>();

   
    while (iF.hasNext()) {
     
      t1 = iF.nextLine();
      t2 = iF.nextLine();
      songs.add(t1+" by "+t2);
    }
    iF.close();

    String[] songsArray = songs.toArray(new String[0]);

    for (String s : songsArray) {
      System.out.println(s);}
        
        }
}
