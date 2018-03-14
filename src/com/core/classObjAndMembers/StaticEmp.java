package com.core.classObjAndMembers;

/*
 * Static mainly used for memory management efficiently 
 * Static keyword - cannot use non-static members and non-static methods directly
 * cannot use this and super in static methods
 * static memory is created in class area
 * for static members and method no need to create instance 
 */
public class StaticEmp {

	private static int num = 10;
	static String stMethod(String a){
		System.out.println("ST METHOD and number"+num);
		return "Static 1 --"+a;
	}
	String stMethod(int b){
		System.out.println("NON ST METHOD");
		return "Static 2 ---"+b;
	}
	
	public static void main(String[] args) {
		stMethod("as");	
		StaticEmp sa = new StaticEmp();		
		sa.stMethod(1);
	}
}

/*
 * Static block is used initialize static data members
 * It execute before the main method at the time of class loading
 * we can execute java program with out main method using static block
 */
class StaticBlock{
	static{
		System.out.println("HI");
	}
}