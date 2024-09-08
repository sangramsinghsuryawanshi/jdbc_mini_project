package assignment39.string.com;

import java.util.Scanner;

public class RemoveNonAlphaNumeric 
{
	public static String isAlphaNumeric(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i)))
			{
				continue;
			}
			s1+=s.charAt(i);
		}
		return s1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("-----------------------");
		System.out.println("Given AlphaNumeric String is:\n"+isAlphaNumeric(str));
	}
}

