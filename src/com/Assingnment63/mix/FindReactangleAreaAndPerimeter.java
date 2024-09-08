/*
 * 10.Create a class Rectangle with methods to calculate area and perimeter. 
 * Implement a subclass Square and override necessary methods.
 */
package com.Assingnment63.mix;
class Rectangle
{
	static int l=4,w=6;
	public static void AreaRec()
	{
		int area = l*w;
		System.out.println("Area of Reactangle: "+area);
		Perimeter();
	}
	public static void Perimeter()
	{
		int perimeter = 2*(l+w);
		System.out.println("Perimeter of Reactangle: "+perimeter);
	}
}
class Square extends Rectangle
{
	static int a=3;
	public static void Area()
	{
		int area = a*a;
		System.out.println("Area of Square: "+area);
		Perimeter();
	}
	public static void Perimeter()
	{
		int perimeter = 4*a;
		System.out.println("Perimeter of Square: "+perimeter);
		AreaRec();
	}
}
public class FindReactangleAreaAndPerimeter 
{
	
	public static void main(String[] args) 
	{
		Square.Area();
	}

}
