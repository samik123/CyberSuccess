package edu.cyber.success.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String args[]){  
		Queue<String> queue1 = new PriorityQueue<String>();  
		//ADDING ELEMENTS IN  QUEUE
		queue1.add("MAHARAHTRA"); 
		queue1.add("GUJARAT"); 
		queue1.add("TAMILNADU"); 
		queue1.add("WEST BENGAL"); 

		/*GETTING HEAD ELEMENTS --> if the queue is empty, element throws 
		NoSuchElementException while peek returns false*/
		/*System.out.println("head:"+queue1.element());  
		System.out.println("head:"+queue1.peek());  */

		System.out.println("iterating the queue elements:");  
		
		Iterator itr=queue1.iterator();  
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		
		/*REMOVING ELEMENTS --> when the queue is empty: the remove() 
		method throws an exception, while the poll() method returns null.*/
		/*queue1.remove();  
		queue1.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue1.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  */
	} 
}
