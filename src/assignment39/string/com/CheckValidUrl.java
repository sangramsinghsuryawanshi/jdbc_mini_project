/*
 * 13. Write a program that takes in a string and checks if it is a valid URL.
 */
package assignment39.string.com;

import java.util.Scanner;

public class CheckValidUrl 
{
	public String isValidURL(String s)
	{
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.startsWith("http://") && s.endsWith(".com") && Character.isAlphabetic(s.charAt(i)))
			{
				cnt++;
			}
		}
		if(cnt>0)
		{
			return"URL is valid";
		}
		else
		{
			return"URL is not valid";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		CheckValidUrl v = new CheckValidUrl();
		String e=v.isValidURL(s);
		System.out.println(e);
	}
}
