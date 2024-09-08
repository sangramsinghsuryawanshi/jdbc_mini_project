/*
 * 18. Write a program that takes in a string and checks if it contains only unique
characters.

 */
package assignment39.string.com;

import java.util.Scanner;

public class UniqueCharacters 
{
	public String isUnique(String str)
	{
		int c=0;
		for(int i=0;i<str.length()-1;i++)
		{
				if(str.charAt(i)==str.charAt(i+1))
				{
					c++;
				}
		}
		if(c!=0)
		{
			return "Its not a unique character";
		}
		else
		{
			return "Its a unique character";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		UniqueCharacters u = new UniqueCharacters();
		String s=u.isUnique(str);
		System.out.println(s);
	}

}
