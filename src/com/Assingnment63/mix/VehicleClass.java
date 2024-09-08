/*
 * 
17.Implement a Vehicle class with methods to start and stop. 
Create subclasses Car and Bike and demonstrate polymorphism.

 */
package com.Assingnment63.mix;

class Vehical
{
	void start()
	{
		System.out.println("Vehical start..");
	}
	void stop()
	{
		System.out.println("Vehical stop..");
	}
}
class Car extends Vehical
{
	void start()
	{
		System.out.println("Car start..");
	}
	void stop()
	{
		System.out.println("Car stop..");
	}
}
class Bike extends Vehical
{
	void start()
	{
		System.out.println("Bike start..");
	}
	void stop()
	{
		System.out.println("Bike stop..");
	}
}
public class VehicleClass
{
	public static void main(String[] args) 
	{
		Vehical ve;
		ve = new Bike();
		ve.start();
		ve.stop();
		
		ve = new Car();
		ve.start();
		ve.stop();
	}
}
