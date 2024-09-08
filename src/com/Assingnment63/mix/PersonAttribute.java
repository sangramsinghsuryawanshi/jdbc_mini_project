/*
 * 12.Implement a Person class with attributes name, age, and address. 
 * Create a subclass Student with an additional attribute rollNumber.
 */
package com.Assingnment63.mix;
class Person
{
	static String name="sangram";
	static int age=21;
	static String address="karad";
	public static void info()
	{
		System.out.println("------------<Person Information>-----------");
		System.out.println("Person name: "+name);
		System.out.println("Person age: "+age);
		System.out.println("Person address: "+address);
		Student.addField();
	}
}
class Student
{
	static int rollNo=98;
	public static void addField()
	{
		System.out.println("Student RollNo: "+rollNo);
	}
}
public class PersonAttribute
{
	public static void main(String[] args) 
	{
		Person.info();
	}
}
