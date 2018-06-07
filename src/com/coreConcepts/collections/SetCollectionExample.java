package com.coreConcepts.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionExample {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet();
		s.add(1);
		s.add(1);
		
		Set<Employee> emp = new HashSet();
		Employee e1 = new Employee("ABC",25);
		emp.add(new Employee("ABC",25));
		emp.add(new Employee("ABC",25));
		
		System.out.println("Output"+s +s.size());
		
		
		System.out.println("Output"+emp +emp.size());
	}
}

class Employee{
	public String name;
	public int age;
	
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}