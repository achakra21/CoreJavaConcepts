package com.demo.java8features;

import javax.activation.MailcapCommandMap;

public class Java8FeatureLambdaExpresion {
	
	/*some of the feature of java 8 lambda expression
	 * optional type declaration - no need to declare the type of parameter,the compiler can 
	 * can interfence the same and assign the perticular value
	 * optional paranthesis around the parameter - no need to declare a single parameter
	 * in paranthesis .for multiple parameter paranthesis is required
	 * optional curly braces - No need to user curley braces in expression body if the body contains 
	 * single statement
	 * optional return keyword -- the compiler automatically the returns the type value
	 * curley braces are required to indicate the expression returns a value   */
	
	public static void main(String args[]){
		
		Java8FeatureLambdaExpresion d = new Java8FeatureLambdaExpresion();
		
		//with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
	      
	      //without type declaration
	      MathOperation substraction = (a, b) -> a - b;
	      
	      //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	      //without return statement and without curly braces
	      MathOperation division = (int a,   int b) -> a / b;
	      
	      System.out.println("Addition:   "+ d.operate(12, 12, addition));
	      System.out.println("substration:   "+d.operate(12, 12, substraction));
	      System.out.println("multiplication:   "+d.operate(12, 12, multiplication));
	      System.out.println("divide:   "+d.operate(12, 12, division));
	      
	      
	      
		
		
		
		
	}
	
	interface MathOperation {
		int operation(int operator1,int operator2);
		
	}
	
	private int operate(int a ,int b , MathOperation mathOperation){
		return mathOperation.operation(a,b);
	}
		
	

}
