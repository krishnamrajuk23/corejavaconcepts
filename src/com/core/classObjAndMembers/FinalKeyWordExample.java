package com.core.classObjAndMembers;

/*
 * Final keyword is used to restrict user to change the value
 * It can be applicable to
 * 	1. variables
 *  2. methods
 *  3. class
 * 
 * If final key is apply to variable the value cannot changed
 * If final key is apply to methods the method cannot be override it.
 * If apply to class, it cannot be extended i.e, inheritances is not possible
 *
 * Final method can be inherited but not override it 
 * 
 * variable with no value is initialized to final key is know as blank final variable
 * Blank final variable is initialized only in constructor. 
 * If final variable is static then this will be initialized only in static block 
 */
public class FinalKeyWordExample {

}

//Blank final variable is initialized only in constructor

class Test{
	public final String name;
	Test(){
		name = "Raju";
	}
	
}

