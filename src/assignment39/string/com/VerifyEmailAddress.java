package assignment39.string.com;

import java.util.Scanner;

public class VerifyEmailAddress 
{
	public String isValid(String s)
	{
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.contains("@gmail.com") && Character.isDigit(s.charAt(i)))
			{
				cnt++;
			}
		}
		if(cnt>0)
		{
			return"Email is valid";
		}
		else
		{
			return"Email is not valid";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		VerifyEmailAddress v = new VerifyEmailAddress();
		String e=v.isValid(s);
		System.out.println(e);
	}
}
