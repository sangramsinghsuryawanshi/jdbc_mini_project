/*
 * 15. Write a program that takes in a string and capitalises the first letter of each word.
 */
package assignment39.string.com;

import java.util.Scanner;

public class CapitalizeFirstLetter 
{
	public String capitalFirst(String s)
	{
		String s1[]=s.split(" ");
		String temp=" ";
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].length()>0)
			{
				temp+=Character.toUpperCase(s1[i].charAt(0))+s1[i].substring(1)+" ";
			}
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		CapitalizeFirstLetter v = new CapitalizeFirstLetter();
		String e=v.capitalFirst(s);
		System.out.println(e);
	}

}
