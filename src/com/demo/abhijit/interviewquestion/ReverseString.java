package com.demo.abhijit.interviewquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclEntry.Builder;

/* Here we will reverse the String*/


public class ReverseString {
	
	public static void main(String[]args){
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);  
	 
	System.out.println("Enter your name"); 
	try {
		String name = br.readLine();
		
		char[] strSplit = name.toCharArray();
		
		StringBuilder builder = new StringBuilder();
		for (int i = strSplit.length-1; i>= 0;i-- ){
			builder.append(strSplit[i]);
		}
		System.out.println("The Reverse Array::::"+builder.toString());
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
	
	
	}
	

}
