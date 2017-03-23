package com.demo.java8features;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

public class ForEachInteratorJava8 {
	
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<=10;i++){
			list.add(i);
		}
		
		//traversing using iterator
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()){
			System.out.println("The Value  "+ iterator.next());
		}
		
		
		//	//traversing through forEach method of Iterable with anonymous class
		
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("The Value Usinf foreach  "+t);
				
			}
			
		});
	}

}
