/*
 * 16.Create a class Employee with methods to calculate salary. Implement 
 * a subclass Manager with additional benefits calculation.
 */
package com.Assingnment63.mix;
class Employee
{
	static String name;
	static int salary;
	public Employee(String name, int salary) 
	{
		Employee.name = name;
		Employee.salary = salary;
	}
	public static void isEmp()
	{
		System.out.println("Emp Name: "+name);
		System.out.println("Emp Salary: "+salary);
	}
}
class Manager extends Employee
{
	public Manager(String name, int salary) 
	{
		super(name, salary);
	}
	public static void isMan()
	{
		int msal=salary/12*25;
		name="abcd";
		System.out.println("Manager Name: "+name);
		System.out.println("Manager Salary: "+msal);
	}
}
public class EmpSalary 
{
	public static void main(String[] args) 
	{
		Employee m = new Employee("Abhi", 2000000);
		Employee.isEmp();
		Manager.isMan();
	}
}
