package com.core.ploymorphism;

import java.io.IOException;

/*
 * If subclass as same method as super class, it know as method overloading
 * @Rules:
 * 	1. Must be same method as in parent class
 * 	2. Must same parameter as in parent class 
 *  3. Must be is-a relation i.e, inheritance
 *  
 * Static Method cannot overridden because static methods are bound to class and instance method are bound to object
 * Static belongs to class area and object are belongs to heap area
 * 
 * method exception need to be more specific
 * for example parent class does not handle method exception and when u try to handle exception in child class it throws
 * compile time exception. 
 * 
 * if Parent class method handle exception and child class method exception need to be same or parent class as to be high level exception 
 * i.e,parent class as Exception for method and child class can have IOException, Classnotfound exception, etc for the same method which is overridden is possible
 *  
 */
public class MethodOverriding {
	public static void main(String[] args) throws IOException {
		HDFC h = new HDFC();
		h.display();
		
		SBI s = new SBI();
		s.display();
	}
}

class Bank{
	protected Integer rateOfInterest() throws Exception{
		return 0;
	}	
}

class HDFC extends Bank{
	public Integer rateOfInterest() throws IOException{
		return 11;
	}
	
	public void display() throws IOException{
		System.out.println(" HDFC Rate of interest: "+ rateOfInterest());
	}
}


class SBI extends Bank{
	public Integer rateOfInterest(){
		return 8;
	}
	
	public void display(){
		System.out.println(" SBI Rate of interest: "+ rateOfInterest());
	}
}