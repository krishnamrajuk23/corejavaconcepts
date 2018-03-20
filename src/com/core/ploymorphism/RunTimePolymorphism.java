package com.core.ploymorphism;

/*
 * Run Time Ploymorphism - is also called as Dynamic dispatch
 * Overridden method is called through super class reference. its called during runtime rather then compile time
 * when reference variable of parnet class is refers to the child class its know as upcasting
 *  
 */
public class RunTimePolymorphism {
	public static void main(String[] args) {
		SuperClass s = new SubClass();
		s.show();
		System.out.println(s.getName());
	}
}

class SuperClass{
	private String name = "super";	
	public void show(){
		System.out.println("Parnet");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class SubClass extends SuperClass{
	private String name = "Sub class";	// It cannot be overridden because overriding is not possible for data members
	public void show(){
		System.out.println("child");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

