/*
 * 23. Write a program that takes in a string and returns the most common substring of
length k.

 */
package assignment39.string.com;

import java.util.Scanner;

public class MostCommonSubstring 
{
	public static String isFirst(String s,int le)
	{
		String s1[]= new String[3];
		for(int i=0;i<3;i++)
		{
			s1[i]=s.substring(i*le, (i+1)*le);
		}
		int max=0;
		String s2=null;
		for(int i=0;i<s1.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					cnt++;
				}
			}
			if(cnt>max)
			{
				max=cnt;
				s2=s1[i];
			}
		}
		return s2;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("Enter length: ");
		int le=sc.nextInt();
		int it=str.length();
		int par=it/le;
		System.out.println("Given charater is: "+isFirst(str,par));
	}

}

