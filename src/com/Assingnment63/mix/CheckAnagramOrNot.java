package com.Assingnment63.mix;

import java.util.Arrays;

public class CheckAnagramOrNot
{

	public static String isAna(String one,String two)
	{
		char ch[]=one.toCharArray();
		char ch1[]=two.toCharArray();
		Arrays.sort(ch);
		String s = new String(ch);
		Arrays.sort(ch1);
		String s1 = new String(ch1);
		if(s.equals(s1))
		{
			return "Given string is Anagram";
		}
		else
		{
			return "Given string is not Anagram";
		}
	}
	public static void main(String[] args) 
	{
		String pal="listen";
		String pal1="silent";
		System.out.println(isAna(pal,pal1));
	}

}
