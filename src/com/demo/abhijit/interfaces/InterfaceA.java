package com.demo.abhijit.interfaces;

public interface InterfaceA {
	
	//can make a static method in an interface but have to add a body to the method
	

	public static void method1() {
		System.out.println("This is method1");
	}

	public default void method3() {

		System.out.println("This is method3");
	}
	
	
	//A interface method can only allow static,public ,default and abstract
	public  void method4();
	public void method5();
	
}
