/*
 * 
 */
package com.Assingnment63.mix;

public class LongestSubstringWithoutRepeating 
{
	public static void issub(String d) 
	{
		int max=0;
		String temp=null;
		for(int i=0;i<d.length();i++)
		{
			for(int j=i+1;j<d.length();j++)
			{
				String str = d.substring(i, j);
				int cnt=1;
				for(int k=0;k<str.length();k++)
				{
					for(int y=k+1;y<str.length();y++)
					{
						if(str.charAt(k)==str.charAt(y))
						{
							cnt++;
							break;
						}
					}
					
				}
				if(cnt==1)
				{
					if(str.length()>max)
					{
						max=str.length();
						temp=str;
					}
				}
			}
		}
		System.out.println(temp);
	}
	public static void main(String[] args) 
	{
		issub("abcabcabc");
	}
}
