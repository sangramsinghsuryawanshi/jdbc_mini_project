/*
 * 13.Write a program demonstrating the concept of method overloading and method overriding
 */
package com.Assingnment63.mix;

class A
{
	public void info(String name,int age)
	{
		System.out.println("------------<Person Information>-----------");
		System.out.println("Person name: "+name);
		System.out.println("Person age: "+age);
	}
	public void info(String address)
	{
		System.out.println("Person address: "+address);
	}
}
class B extends A
{
	public void info(String address)
	{
		System.out.println("Student address: "+address);
	}
}
public class MethodOverloadingAndOverriding 
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.info("Sangram", 21);
		a.info("Karad");
		B b = new B();
		b.info("Vita");
		b.info("Sangram", 21);
	}
}
