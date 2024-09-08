/*
 * 28. Write a program that takes in a string and returns the character that appears the most
in the string, breaking ties alphabetically.

 */
package assignment39.string.com;

import java.util.Arrays;
import java.util.Scanner;

public class MostRepetedChar 
{
	public static char isMostFre(String s)
	{
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		int max=0;
		char maxFreqencyCha='0';
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
				}
			}
			if(cnt>max)
			{
				max=cnt;
				maxFreqencyCha=ch[i];
			}
		}
		return maxFreqencyCha;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("-----------------------");
		System.out.println("The character appears the most in the string is:\n"+isMostFre(str));
	}
}

