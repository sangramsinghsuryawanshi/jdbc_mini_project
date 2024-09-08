package com.Assingnment63.mix;

public class CheckFlotingPoint 
{
	public static void isValid(String str)
	{
		if(str.contains("."))
		{
			System.out.println("Valid number");
		}
		else
		{
			System.out.println("not Valid number");
		}
	}
	public static void main(String[] args) 
	{
		String str ="343.33";
		isValid(str);
	}
}
