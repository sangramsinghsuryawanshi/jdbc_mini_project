/*
 * 19.Design a class Library with methods to add and remove books. 
 * Implement a subclass DigitalLibrary for managing e-books.
 */
package com.Assingnment63.mix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Library
{
	List<String> sb;
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Name: ");
		sb = new ArrayList<String>();
		for(int i=0;i<=2;i++)
		{
			sb.add(sc.nextLine());
		}
		System.out.println("Book Added: "+sb);
		System.out.println("---------<>--------");
	}
	public void remove()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Name to remove: ");
		String s=sc.nextLine();
		sb.remove(sb.indexOf(s));
		System.out.println("Book Removed: "+sb);
		System.out.println("---------<>--------");
	}
}
class DigitalLibrary extends Library
{
	public void Manage()
	{
		System.out.println("Given Books: ");
		for(String d:super.sb)
		{
			System.out.println(d);
		}
	}
}
public class EBook 
{
	public static void main(String[] args) 
	{
		DigitalLibrary dg = new DigitalLibrary();
		dg.add();
		dg.remove();
		dg.Manage();
	}
}
