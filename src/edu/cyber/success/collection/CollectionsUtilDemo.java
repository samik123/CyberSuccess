package edu.cyber.success.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilDemo {

	public static void main(String[]args){

		List<String> fruits = new ArrayList<String>();

		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grape");
		System.out.println(fruits);
		//Now, we will sort it using Collections.sort():
		Collections.sort(fruits);
		System.out.println("AFTER SORT FRUIT LIST");
		// Print the sorted list
		System.out.println(fruits);
		// binarySearch on the list
        /*System.out.println("The index of Apple is "
            + Collections.binarySearch(fruits, "Apple"));*/
 
        // binarySearch on the list
        /*System.out.println("The index of Grape is "
            + Collections.binarySearch(fruits, "Grape"));*/
	}
}
