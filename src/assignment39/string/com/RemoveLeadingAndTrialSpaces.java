/*
 * 26. Write a program that takes in a string and removes all leading and trailing whitespace
characters.

 */
package assignment39.string.com;

import java.util.Scanner;

public class RemoveLeadingAndTrialSpaces 
{
	public static String isCount(String s)
	{
		return s.trim();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("-----------------------");
		System.out.println("removed all leading and trailing whitespace:\n"+isCount(str));
	}

}

