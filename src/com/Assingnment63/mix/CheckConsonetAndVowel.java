/*
 * 21.Implement a function to count the 
 * number of vowels and consonants in a string.
 */
package com.Assingnment63.mix;

public class CheckConsonetAndVowel {
	public static String iscnt(String s)
	{
		int cnt=0,c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				cnt++;
			}
			else
			{
				c++;
			}
		}
		return cnt+"||::||"+c;
	}

	public static void main(String[] args) 
	{
		String n="programming";
		System.out.println("Vowel count-<>"+iscnt(n)+"<>-Consonent count");
	}

}
