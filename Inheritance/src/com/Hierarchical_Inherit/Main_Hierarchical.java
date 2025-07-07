package com.Hierarchical_Inherit;

public class Main_Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		System.out.println("****************Person Details **************");
		System.out.println(p1);
		
		System.out.println("*********************************");
		//Student s=new Student();
		Person p;
		p=new Person("Vaishnavi", "Pune");
		System.out.println("Person Details "+ p);
		
		p=new Student("Dhruv", "Nashik", "DV", 35.34f);
		System.out.println("Students details "+ p);
		
		p=new Employee("neha", "Mumbai", 6034, 650000, "Development");
		System.out.println("employee details "+ p);
		

	}

}
