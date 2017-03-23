package com.demo.designpatterens;

public class SingleTonClass {
	
	
	
	private SingleTonClass(){}
	
	static SingleTonClass tonClass = new SingleTonClass();
	
	public static SingleTonClass getInstance(){
		return tonClass;
	}
	
	public void method1(){
		
		System.out.println("Inside method1 in SingleTonClass");
	}

}
