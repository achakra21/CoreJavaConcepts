package com.demo.abhijit.strings;

public class StringTokenizer {
	
static String testString = "[abhijit.ggghh,gdgdg.ggdg,wfwfwfwf.tutu]";
	
	public static void main(String args[]){
		String newString = testString.substring(1,testString.length()-1);
		
		System.out.println(newString);
		String[] subString = newString.split(",");
		System.out.println("The Final String:::"+subString+":Leangth"+subString[1]);
		
		
	}

}
