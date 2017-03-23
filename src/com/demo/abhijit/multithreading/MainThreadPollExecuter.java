package com.demo.abhijit.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadPollExecuter {
	
	public static void main(String args[] ){
		
		
		   ExecutorService executor = Executors.newFixedThreadPool(5);//here created 5 threads
		   for ( int i=0;i<=10;i++){
			   Runnable runnable = new ThreadPoolExecuter(""+i);
			   executor.execute(runnable);
		   }
		   
		   executor.shutdown();
		   System.out.println("Finished All threads");
	}

}
