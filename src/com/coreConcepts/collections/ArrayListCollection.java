package com.coreConcepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollection {
	
	private static List<String> arr = new ArrayList<>();
	public static void main(String[] args) {
		arr.add("raju"); // Adding new values into list
		arr.add("rupesh");
		arr.add("jk");
		
		List<String> list = new ArrayList<>(); 
		list.add("222");
		list.add("raju");
		
		arr.addAll(list);  // Adding new list to existing list 
		
		System.out.println("Get " + arr.get(3)); // Get the value at specified index
		
		System.out.println("Sublist " + arr.subList(0, 1));
		 
		System.out.println("Last Index of " +arr.lastIndexOf("raju")); // Return the last index value that is matched
		
		String a = (arr.indexOf("raju") > -1) ? arr.remove(4) : ""; // Remove the value at specified index
		System.out.println(a);
		
		System.out.println("set Value " + arr.set(2,"Das")); // Updating the value at specified index
		
		System.out.println("Final List" + arr);
		
		//Iterating using for() -  List
		for(String val : arr){
			System.out.println("For Loop " + val);
		}
		
		Iterator<String> list1 = arr.iterator(); // Iterator is a interface it consist of inbuilt methods for iterator of list
		System.out.println(list1.next()); // To get single value from list 
		
		// hasNext -  it return list if it as more elements in it		 		
		while(list1.hasNext()){ 
			System.out.println(list1.equals("Das"));
			System.out.println("Iterator with next valu e" + list1.next()); // Return value if it consist of next value in its
			
		}
		
		// forEach in Java 8		
		arr.forEach(s -> System.out.println("ForEach java 8 "+ s));
		
		//Searching the elements
		System.out.println("contains " + arr.contains("raju")); // check whether the element is present or not
		System.out.println("IndexOf " + arr.indexOf("Das"));
		
		//Sorting the list
		Collections.sort(arr); // sort the list(first it will integer values and ascending order of elements). Default Ascending order
		System.out.println("Sorting " + arr);
		
		String str1 = "Hi Raju";
		String str2 = "hi raju";
		System.out.println(str1.equalsIgnoreCase(str2)); // Two string comparison
				
	}

}