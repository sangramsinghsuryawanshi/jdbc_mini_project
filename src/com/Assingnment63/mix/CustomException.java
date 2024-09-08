/*
 * 
 */
package com.Assingnment63.mix;
class DivisibleByZero extends Exception
{
	public DivisibleByZero(String msg)
	{
		super(msg);
	}
}
public class CustomException
{
	public static int isHandle() throws Exception
	{
		int a=2,b=0;
		if(b==0)
		{
			throw new DivisibleByZero("Divisible by zero Exception");
		}
		else
		{
			return a/b;
		}
		
	}
	public static void main(String[] args) 
	{
		try {
			System.out.println(isHandle());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
