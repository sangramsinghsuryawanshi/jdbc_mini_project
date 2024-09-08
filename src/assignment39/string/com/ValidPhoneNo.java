/*
 * 22. Write a program that takes in a string and checks if it is a valid phone number (in a
specific format, e.g. (123) 456-7890).

 */
package assignment39.string.com;

import java.util.Scanner;

public class ValidPhoneNo 
{
	
	public static String isFirst(String s)
	{
		String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}";
		if(s.matches(regex))
		{
			return "Valid";
		}
		else
		{
			return "Not Valid";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("----------------------");
		System.out.println(isFirst(str));
	}

}
