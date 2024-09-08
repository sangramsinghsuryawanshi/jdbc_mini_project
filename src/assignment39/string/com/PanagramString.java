/*
 * 33. Write a program that takes in a string and checks if it is a pangram (contains all
letters of the alphabet).

 */
package assignment39.string.com;

import java.util.Scanner;

public class PanagramString 
{

	public static boolean isCount(String s)
	{
		
		String []s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int cnt=1;
			for(int j=0;j<s1[i].length()-1;j++)
			{
				if(s1[i].charAt(j)==s1[i].charAt(j+1))
				{
					cnt++;
				}
			}
			if(cnt==1)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("-----------------------");
		if(isCount(str))
		{
			System.out.println("Given string is panagram ");
		}
		else
		{
			System.out.println("given string is not panagram");
		}
	}

}

