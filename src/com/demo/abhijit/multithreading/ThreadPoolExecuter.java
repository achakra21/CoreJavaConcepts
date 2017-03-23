package com.demo.abhijit.multithreading;

public class ThreadPoolExecuter implements Runnable {
	
	private String messsage;
	
public ThreadPoolExecuter(String msg) {
		this.messsage = msg;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start");
		processThread();
		System.out.println(Thread.currentThread().getName()+"End");
		
		
	}
	
	public void processThread(){
		try{
			Thread.sleep(3000);
		} catch(InterruptedException exception){
			exception.printStackTrace();
		}
	}
	
	
	
}
