package com.kalia.classloading;
class Student{
	//mathood area 
	//  statric mathod 
	//getName (package +class name)
	
	
}
class Employee{
	
}
class Customer{
	
}
public class MethodAreaDemo {

	public static void main(String[] args) {
	Class	cls=Student.class;
	String name = cls.getName();
	System.out.println(name);
	Class	kk=Employee.class;
	String name1 = kk.getName();
	System.out.println(kk);
	Class	name2=Customer.class;
	String name3 = name2.getName();
	System.out.println(name3);
	}

}
