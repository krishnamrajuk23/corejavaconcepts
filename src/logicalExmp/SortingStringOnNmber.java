package logicalExmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingStringOnNmber {
	static void listSort(){

		List<String> numbers = new ArrayList<String>();
		numbers.add("four");
		numbers.add("two");
		numbers.add("five");
		numbers.add("one");
		numbers.add("three");

		System.out.println("Before Sorting");
		for (String string : numbers) {
			System.out.println(string);
		}

		Map<String, Integer> numbermap = new HashMap<String, Integer>();
		numbermap.put("one", 1);
		numbermap.put("two", 2);
		numbermap.put("three", 3);
		numbermap.put("four", 4);
		numbermap.put("five", 5);

		Collections.sort(numbers, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return numbermap.get(o1).compareTo(numbermap.get(o2));
			}
		});

		System.out.println("After Sorting");
		for (String string : numbers) {
			System.out.println(string);
		}

	}


	static void pojoSort(){

		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(5, "55555"));
		emp.add(new Employee(1, "11111"));
		emp.add(new Employee(3, "33333"));
		emp.add(new Employee(4, "44444"));
		emp.add(new Employee(2, "22222"));
		

		System.out.println("Before Sorting");
		/*for (String string : numbers) {
			System.out.println(string);
		}
*/
		/*Map<String, Integer> ordermap = new HashMap<String, Integer>();
		ordermap.put("11111", 1);
		ordermap.put("22222", 2);
		ordermap.put("33333", 3);
		ordermap.put("44444", 4);
		ordermap.put("55555", 5);*/

		Collections.sort(emp, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getId() - o2.getId();
			}
		});

		System.out.println("After Sorting");
		for (Employee e : emp) {
			System.out.println(e.getId());
		}

	}

	public static void main(String[] args) {
		pojoSort();
	}

}

class Employee {
	private Integer id;
	private String salary;
	
	public Employee(Integer id, String salary) {
		this.id = id;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}