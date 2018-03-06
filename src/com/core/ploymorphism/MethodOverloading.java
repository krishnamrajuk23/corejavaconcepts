package com.core.ploymorphism;

/*
 * In method overloading - same method name and different parameter list 
 * Must change parameter list - Parameters or Parameter types or both should vary
 * changing only return type does not matter 
 * both instance and static methods are overloaded
 * 
 */
public class MethodOverloading {
	/*
	 * When we have the value between short and int - it will be choosen int 
	 * When the value is byte or short - it will be choosen short
	 * By Default integer value is consider in overloading
	 * we need to type casting for specific method to overloading
	 * */
	public void overloadding(int i){
		System.out.println("Integer value "+i);
	}
	
	public void overloadding(short b){
		System.out.println("short value"+ b);
	}
	
	public void overloadding(long b){
		System.out.println("long value"+ b);
	}
	
	public static void main(String[] args) {
		MethodOverloading old = new MethodOverloading();
		/*byte b= 10;*/
		old.overloadding((byte)1);
		old.overloadding(124553499955555L);
		old.overloadding(1);
	}

}
