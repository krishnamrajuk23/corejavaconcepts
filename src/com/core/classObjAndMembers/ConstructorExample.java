package com.core.classObjAndMembers;

/*
 * By Default constructor is created by the jvm with no arguments/parameters
 * Constructor cannot have return type if we specified it leads to compile time error
 * constructor is used to initialized the values, creating object
 * Constructor method cannot call itself - which means recursion is not possible
 * Constructor Overloading is possible
 * Cannot use instance variable as arguments in the constructor  
 * */
public class ConstructorExample {
	public int age;
	public String name;
	public String hobbies; // instance variable
	
	public ConstructorExample(){
		
	}
	public ConstructorExample(int age){
		//this(50); // Constructor method cannot call itself - which means recursion is not possible
		//this(age, hobbies); //Cannot use instance variable as arguments in the constructor
		this.age = age;
		System.out.println("Number " + this.age);
		
	}
	public ConstructorExample(int age, String name){
		/*this keyword - it would be the first statement of the constructor 
		 * and call another constructor which match with the arguments
		 */
		this(age);		
		//this(age);		// this keyword calling invocation only one per constructor
		System.out.println("Name " + name + "Age is "+ this.age);
	}
	public static void main(String[] args) {
		ConstructorExample ctr = new ConstructorExample();  // Creating constructor with no arguments
		ConstructorExample ctr1 = new ConstructorExample(10); // Creating constructor with arguments
		ConstructorExample ctr2 = new ConstructorExample(24, "raju");
	}

}
