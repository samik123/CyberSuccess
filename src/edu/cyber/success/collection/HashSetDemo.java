package edu.cyber.success.collection;
import java.util.*;  

public class HashSetDemo {

	public static void main(String args[]){  

		//Creating HashSet and adding elements  
		Set<String> set=new HashSet<String>(); 

		//adding element
		set.add("One");    
		set.add("Two");    
		set.add("Three");   
		set.add("Four");  
		set.add("Five");  

		//iterating set elements
		Iterator<String> i = set.iterator();  

		while(i.hasNext()) {  
			System.out.println(i.next());  
		}  

		//duplicate entry
		/*set.add("One"); 
		Iterator<String> i=set.iterator();
		while(i.hasNext()) {  
			System.out.println(i.next());  
		} */


	}
}
