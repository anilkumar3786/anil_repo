package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManip1 {
public static void main(String args[]){
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please Enter the Text ");
		 
		    String s= keyboard.nextLine();
		    String startChar = keyboard.nextLine();
		    String endChar = keyboard.nextLine();
		    System.out.println("Start String = " +  startChar);
		    System.out.println("End String = " +  endChar);
		    keyboard.close();

		//String s="Sun rises in {This is test} East {this} sdfskafh {it} ppppp {ttttttttttttttttttttt}";  
		
		//Pattern p = Pattern.compile("\\{(.*?)\\}");
		Pattern p = Pattern.compile("\\"+startChar+ "(.*?)" + "\\"+ endChar);
		Matcher m = p.matcher(s);
		int len = s.length();
		String removeString="";
		while(m.find())
		{
			if (m.group(1).length() < len){
				len = m.group(1).length();
				removeString = m.group(1);
			}	
		}
	    
	    System.out.println("Shortest String = " +  removeString);
	    String removeStr = startChar + removeString + endChar;
	    System.out.println("Remove String = " +  removeStr);
	    String manipString = s.replaceAll("\\" + removeStr, startChar + endChar);
		  
	    System.out.println(" String final =" +  manipString);
		 
		 
		 
	}
}
