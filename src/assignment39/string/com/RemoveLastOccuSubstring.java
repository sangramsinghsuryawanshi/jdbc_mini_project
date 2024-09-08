/*
 * 32. Write a program that takes in a string and returns the index of the last occurrence of
a given substring.

 */
package assignment39.string.com;

import java.util.Scanner;

public class RemoveLastOccuSubstring 
{
	public static int isSub(String s,int subLen,int parSubLen)
	{
		String s1[]=new String[parSubLen];
		for(int i=0;i<parSubLen;i++)
		{
			
            s1[i] = s.substring(i*subLen, (i+1)*subLen);
		}
		int c=-1;
		for(int i=s1.length-1;i>=0;i--)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(s1[i].equals(s1[j]))
				{
					if(c==-1)
					{
						c=i;
						break;
					}
				}
			}
			if(c!=-1)break;
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("Enter given substring length: ");
		int subLen=sc.nextInt();
		int StrLe=str.length();
		int parSubLen=StrLe/subLen;
		System.out.println("-----------------------");
		System.out.println("The index of the last occurrence of a given substring is:\n"+isSub(str,subLen,parSubLen));
	}
}

