package assignment39.string.com;

import java.util.Scanner;

public class CheckPass 
{
	public static String isValidPass(String s)
	{
		String s1="";
		int upperCnt=0,LowerCnt=0,SpeCharCnt=0,StrCnt=0,DigCnt=0;
		for(int i=0;i<s.length();i++)
		{
			StrCnt++;
			if(Character.isUpperCase(s.charAt(i)))
			{
				upperCnt++;
			}
			else if(Character.isLowerCase(s.charAt(i)))
			{
				LowerCnt++;
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				DigCnt++;
			}
			else
			{
				SpeCharCnt++;
			}
		}
		if(upperCnt>=1 && LowerCnt>=1 && DigCnt>=1 && SpeCharCnt>=1 && StrCnt>=8)
		{
			return "It is a valid password";
		}
		else
		{
			return "It is not a valid password";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given Pass: ");
		String str = sc.nextLine();
		System.out.println("-----------------------");
		System.out.println(isValidPass(str));
	}
}

