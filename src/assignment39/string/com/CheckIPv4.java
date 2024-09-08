/*
 * 14. Write a program that takes in a string and checks if it is a valid IPv4 address.
 */
package assignment39.string.com;

import java.util.Scanner;

public class CheckIPv4 
{
	public String isValidIPv4(String s)
	{
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.contains(".")&& Character.isDigit(s.charAt(i)))
			{
				cnt++;
			}
		}
		if(cnt>0)
		{
			return"IPv4 is valid";
		}
		else
		{
			return"IPv4 is not valid";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		CheckIPv4 v = new CheckIPv4();
		String e=v.isValidIPv4(s);
		System.out.println(e);
	}

}
