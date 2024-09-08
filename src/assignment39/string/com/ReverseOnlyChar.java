/*
 * 16. Write a program that takes in a string and returns the characters in reverse order, but
preserves the order of words.

 */
package assignment39.string.com;

import java.util.Scanner;

public class ReverseOnlyChar 
{

	public String reverseChar(String s)
	{
		String s1[]=s.split(" ");
		String temp=" ";
		for(int i=0;i<s1.length;i++)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				temp+=s1[i].charAt(j);
			}
			 if(i<s1.length-1) {
	                temp+=" ";
	            }
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		ReverseOnlyChar v = new ReverseOnlyChar();
		String q=v.reverseChar(s);
		System.out.println(q);
	}

}
