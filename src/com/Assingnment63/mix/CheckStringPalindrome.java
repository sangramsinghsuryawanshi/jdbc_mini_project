/*
 * 20.Write a program to check if a string is a palindrome.
 */
package com.Assingnment63.mix;

public class CheckStringPalindrome 
{
	public static String isPal(String pal)
	{
		StringBuffer sb = new StringBuffer(pal);
		sb.reverse();
		if(sb.toString().equals(pal))
		{
			return "Given string is palidrome";
		}
		else
		{
			return "Given string is not palidrome";
		}
	}
	public static void main(String[] args) 
	{
		String pal="madam";
		System.out.println(isPal(pal));
	}

}
