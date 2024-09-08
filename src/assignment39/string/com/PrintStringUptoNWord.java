package assignment39.string.com;

import java.util.Scanner;

public class PrintStringUptoNWord 
{
	public static String isNWord(String s,Scanner sc)
	{
		System.out.println("Enter n number: ");
		int n=sc.nextInt();
		String s1[]=s.split(" ");
		String temp="";
		for(int i=0;i<s1.length;i++)
		{
			if(n+i<s1.length)
			{
				temp+=" "+s1[n+i];
			}
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		System.out.println("Given n word is: "+isNWord(s,sc).trim());
	}

}