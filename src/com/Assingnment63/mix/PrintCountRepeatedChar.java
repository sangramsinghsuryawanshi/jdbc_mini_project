/*
 * 25.Implement a function to perform basic string 
 * compression using the counts of repeated characters.
 */
package com.Assingnment63.mix;

public class PrintCountRepeatedChar 
{
	public static void isRe(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0' &&ch[i]!=' ' && cnt>1)
			{
				System.out.println(ch[i]+" "+cnt);
			}
		}
	}
	public static void main(String[] args) 
	{
		isRe("java is simple");
	}
}
