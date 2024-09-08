package assignment39.string.com;

import java.util.Scanner;

public class ReverseWordAndRetrun 
{
	public static String isReverseWord(String s)
	{
		String s1[]=s.split(" ");
		String temp="";
		for(int i=s1.length-1;i>=0;i--)
		{
			temp+=" "+s1[i];
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		System.out.println("Given reverse word is: "+isReverseWord(s).trim());
	}

}