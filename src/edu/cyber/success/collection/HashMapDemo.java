package edu.cyber.success.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[]args){

		// Create a HashMap object called capitalCities
		Map<String,String> stateCapMap=new HashMap<String,String>();

		// Add keys and values (Country, City)
		stateCapMap.put("Maharashtra","Mumbai");
		stateCapMap.put("West Bengal","Kolkata");
		stateCapMap.put("Odisha","Bhubaneswar");
		stateCapMap.put("Tamilnadu","Chennai");
		//System.out.println(stateCapMap);

		//ACCESS SINGLE ITEM
		//System.out.println(stateCapMap.get("Maharashtra"));

		//REMOVE ALL ITEM
		/*stateCapMap.clear();
		System.out.println(stateCapMap);*/

		//ACCESING SIZE
		//System.out.println(stateCapMap.size());

		// Print keys
		/*for(String state:stateCapMap.keySet()){
			System.out.println(state);
		}*/

		// Print values
		/*for(String cap:stateCapMap.values()){
		System.out.println(cap);
		}*/
		

		// Print keys and values
		/*for(String state:stateCapMap.keySet()){
		System.out.println("key: "+state+" value: "+stateCapMap.get(state));
		}*/
		
		//KEY SHOULD BE UNIQUE OVER HASHMAP
		/*stateCapMap.put("Maharashtra","PUNE");
		for(String state:stateCapMap.keySet()){
			System.out.println("key: "+state+" value: "+stateCapMap.get(state));
		}*/

	}
	

}
