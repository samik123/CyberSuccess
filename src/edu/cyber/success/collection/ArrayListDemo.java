
package edu.cyber.success.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args)  {
		// Size of the ArrayList
		int n = 5;

		// Declaring the ArrayList with initial size n
		List<Integer> list  = new ArrayList<Integer>(n);

		// Appending new elements at the end of the list
		for(int i = 1; i<= n; i++){
			list.add(i);
		}

		// Printing elements
		System.out.println(list);

		// Remove element at index 3
		list.remove(3);

		// Displaying the ArrayList after deletion
		System.out.println(list);

		// Printing elements one by one
		for(int i = 0; i<list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		
		/*list.add(3,10);
		
		System.out.println("");
		
		// iterating with for each loop
		for(Integer num : list){
			System.out.print(num + " ");
		}*/
			
	}


}
