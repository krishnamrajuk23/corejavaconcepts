package com.core.classObjAndMembers;

/*
 * If object want to access its own members - we can use This keyword
 * this is a object reference variable of current object
 * this keyword cannot use in static context 
 * */
public class ThisKeyword {
	
	
	public static void main(String[] args) {
		Student s = new Student("Raju", 1001);
		s.display();		
	}
}

/*
 * 1. Used to refer the current class instance variables
 * 3. Used to invoke current class constructor
 * 5. to pass as argument in the constructor call
 */
class Student{
	String name;
	int rollno = 1000;
	int age;
	
	Student(){
		System.out.println("Default Constructor");		
	} 
	/*
	 * Without using this keyword
	 * value is not assign to the name, roll when we initialized the values 
	 * Hence their will be no effect in the value
	 * @output name null rollno 0
	 */
	/*Student(String name, int rollno){
		name = name;	// set value as - null 
		rollno = rollno;// set value as - 0
	}*/
	
	/*
	 * With using this keyword
	 * value is not assign to the name, roll when we initialized the values
	 * @output name Raju rollno 10001
	 */
	Student(String name, int rollno){
		this.name = name;	
		this.rollno = rollno;
		InvokeMethod inM = new InvokeMethod(this);// 5. to pass as argument in the constructor call
		inM.second();
	}

	/*
	 * not required this keyword - when we have method parameter and instance variable are different
	 * value is not assign to the name, roll when we initialized the values
	 * @output name Raju rollno 10001
	 */
	Student(String n, int r, int a){
		name = n;	
		rollno = r;
		age = a;
	}
	
	void display(){
		System.out.println("name "+ name + " RollNno "+ rollno);
	}
}

/*
 * 2. Used to invoke current class methods
 * 4. To pass as an argument in the method
 * 5. To pass as argument in the constructor call
 * 6. Used to return current class instance
 */
class InvokeMethod {
	Student std;
	InvokeMethod(Student std){
		this.std = std;
	}
	
	void first(){
		System.out.println("first");
	}
	void second(){
		this.first(); // invoking the method
		System.out.println("Inovke Method Roll no " + std.rollno );
	}
	InvokeMethod currentInstance(){
		return this; // 6. Used to return current class instance
	}
}

/*
 * 3. 
 */