package com.demo.abhijit.multithreading;

public class ClassMainThread {
	
	public static void main(String args[]) throws InterruptedException{
		
		
		//create many instances of class extending Thread class
		ThreadBExtendsThread threadBExtendsThread = new ThreadBExtendsThread();
		threadBExtendsThread.start();
		Thread.sleep(1000);
		
		ThreadBExtendsThread threadBExtendsThread1 = new ThreadBExtendsThread();
		threadBExtendsThread1.start();
		Thread.sleep(1000);
		
		ThreadBExtendsThread threadBExtendsThread2 = new ThreadBExtendsThread();
		threadBExtendsThread2.start();
		
		
		//create a single instance of class using Runnable interfaces
		
		ThreadImplementsRunnable implementsRunnable = new ThreadImplementsRunnable();
		Thread thread1 = new Thread(implementsRunnable);
		thread1.start();
		Thread.sleep(1000);
		
		
		Thread thread2 = new Thread(implementsRunnable);
		thread2.start();
		Thread.sleep(1000);
		
		
		Thread thread3 = new Thread(implementsRunnable);
		thread3.start();
	
		
	}

}
