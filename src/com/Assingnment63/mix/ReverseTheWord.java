/*
 * 22.Write a program to reverse the words in a given sentence.
 */
package com.Assingnment63.mix;

public class ReverseTheWord 
{
	public static void isWordRe(String s)
	{
		String []s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		isWordRe("java is simple");
	}
}
