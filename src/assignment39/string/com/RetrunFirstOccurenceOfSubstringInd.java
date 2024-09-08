package assignment39.string.com;

import java.util.Scanner;

public class RetrunFirstOccurenceOfSubstringInd
{
	public static void isCount(String s,int len,int k)
	{
		
		String []s1 = new String[len];
		for(int i=0;i<len;i++)
		{
			s1[i] = s.substring(i*k, (i+1)*k);
		}
		int c=-1;
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					if(c==-1)
					{
						c=i;
					}
				}
			}
		}
		System.out.println(c);
	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("Enter substring length");
		int k=sc.nextInt();
		int len=str.length();
		int parLen=len/k;
		System.out.println("-----------------------");
		isCount(str, parLen, k);
	}

}

