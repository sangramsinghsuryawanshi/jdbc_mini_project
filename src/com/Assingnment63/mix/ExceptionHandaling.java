/*
 * 30.Write a program to demonstrate the use of try,
 *  catch, and finally blocks.
 */
package com.Assingnment63.mix;

public class ExceptionHandaling 
{
	static Exception e1;
	public static Exception isHandle(int a[])
	{
		try
		{
			for(int i=0;i<a.length+1;i++)
			{
				System.out.println(a[i]+" ");
			}
		}
		catch(Exception e)
		{
			return e;
		}
		finally 
		{
			System.out.println("Finally Block..");
		}
		return e1;
	}
	public static void main(String[] args) 
	{
			int a[]= {1,2,3,4,5,};
			System.out.println(isHandle(a));
		
	}
}
