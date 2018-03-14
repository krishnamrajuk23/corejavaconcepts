package com.core.classObjAndMembers;

/*
 * Super key word is used to access the parent class properties
 * 1. Super key is used to invoke instance variable immediately
 * 2. super key is used to invoke instance methods
 * 3. super key is used to invoke parent class constructor
 * 4. In default constructor which is provided by the compiler is automatically add super() as its first statement
 *   
 */
public class SuperKeyExample {
	public static void main(String[] args) {
		SBI s = new SBI(10, "raju", "Hyd");
		s.display();
	}
}

class Bank{
	public int id;
	public String name;
	public String branch = "Hyderabad";
	public void bankName(){
		System.out.println("Bank Name");
	}
	Bank(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("ID "+ this.id +"Name "+ this.name);
	}
}

class SBI extends Bank{
	public String loc;
	SBI(int id, String name, String loc) {
		super(id, name);
		this.loc = loc;
	}

	public void display(){
		System.out.println(super.branch);
		super.bankName();
	}
}