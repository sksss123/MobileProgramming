package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);
       String fr = null;
       try
       {
         BufferedReader inputStream = new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = new PrintWriter(new FileOutputStream(path+"numbered.txt"));

         int a = 1;
         while(true)
         {
        	 fr = inputStream.readLine();
        
        	 if(fr==null)
        		 break;
        	 
          outputStream.println(a + " " +fr);
          a++;
         }
         inputStream.close();
         outputStream.close();
      }
      catch(FileNotFoundException e){
    	  e.printStackTrace();
      }
      catch(IOException e){
    	  e.printStackTrace();
      }

   }
}