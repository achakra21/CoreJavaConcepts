package com.demo.abhijit.interviewquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* A number is prime if it is only divisible by 1 and itself. */

public class Primenumbers  {
	
	public boolean isNumberPrime(int num) {

		for (int i = 0; i <= num; i++) {

			if (i != 0 && i != 1 & i != num) {
				if (num % i == 0) {

					return false;
				}

			}

		}

		return true;
	}

	public static void main(String args[]) {
		Primenumbers primenumbers = new Primenumbers();
		InputStreamReader inputStreamReader  = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		int number = 0;
		try {
			number = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Is Prime Number  "+primenumbers.isNumberPrime( number));

	}

}
