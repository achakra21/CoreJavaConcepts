package com.demo.abhijit.multithreading;

public class ThreadBExtendsThread extends Thread {

	int counter = 0;

	@Override
	public void run() {
		counter++;
		System.out.println("Run method inside ThreadBExtendsThread is Running..." + counter);
	}

}
