package com.demo.abhijit.interviewquestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongestPrefixInStringArray {

	// InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	// BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strings = { "asdjdh", "ddjdjd", "dd", "dhddhhdhd" };
		int lastLength = 0;
		int indexNo = 0;
		for (int i = 0; i <= strings.length-1; i++) {
			
			int currentlength = strings[i].length();
			
			if(currentlength > lastLength){
				
				indexNo  = i;
				
			}
			
			

		}
		System.out.println("Grater prefix::"+ strings[indexNo].toString());
	}

}
