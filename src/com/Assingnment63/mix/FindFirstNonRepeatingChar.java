package com.Assingnment63.mix;

public class FindFirstNonRepeatingChar 
{
	public static char isNonRe(String s)
	{
		char ch[]=s.toCharArray();
		char ch1='\0';
		for(int i=0;i<ch.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				ch1=ch[i];
				break;
			}
		}
		return ch1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Non Repeating Char: "+isNonRe("java is simple"));
	}
}
