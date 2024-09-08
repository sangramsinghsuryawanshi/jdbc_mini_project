package com.Assingnment63.mix;

public class RemoveDuplicates 
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
					ch[j]='0';
				}
			}
			if(ch[i]!='0' && ch[i]!=' ')
			System.out.println(ch[i]+" ");
			
		}
	}
	public static void main(String[] args) 
	{
		isRe("java is simple");
	}
}

