package kc.ac.kookmin.exception.intro;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


class Trade{
	public void readFile(){
		String path = Trade.class.getResource("").getPath();
		String str = "";
		try{
		Scanner in = new Scanner(new File(path + "a.txt"));
		
		while(in.hasNext()){
			str = in.nextLine();
			System.out.println(str);
		}
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			close();
		}
		
	}
	
	void close()
	{
		System.out.close();
	}
}
public class Test {

	public static void main(String[] args) {
		Trade a = new Trade();
		a.readFile();
		
	}

}
