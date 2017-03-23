package com.demo.abhijit.multithreading;

public class ThreadImplementsRunnable implements Runnable {

	int counter = 0;

	@Override
	public void run() {
		counter++;
		System.out.println("Inside Run method of ThreadImplementsRunnable::" + counter);
	}

}
