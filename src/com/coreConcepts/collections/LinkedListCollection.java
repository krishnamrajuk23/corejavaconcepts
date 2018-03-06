package com.coreConcepts.collections;

import java.util.*;

public class LinkedListCollection {
	
	public static void main(String[] args) {
		List<String> linkList = new LinkedList<>();
		linkList.add("Raju");
		linkList.add("jk");
		linkList.add("Rupesh");
		
		Iterator it = linkList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("Size " + linkList.size()); // Size of the List
		
	}

}

class Company implements Comparable{
	private String name;
	private String status;
	
	public Company(String name, String status) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.status = status;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
