/*
 * 27.Implement a function to convert a string to title case 
 * (capitalize the first letter of each word).
 */
package com.Assingnment63.mix;

public class CapitalizeFirstLetter
{
	public static void isWordRe(String s)
	{
		String []s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(Character.toUpperCase(s1[i].charAt(0))+s1[i].substring(1));
		}
	}
	public static void main(String[] args) 
	{
		isWordRe("java is simple");
	}
}

