/*
 * 5. Write a program that takes in two strings and checks if they are anagrams (contain
the same letters in different order).

 */
package assignment39.string.com;

import java.util.Scanner;

public class AnagaramString 
{
	public static boolean isAnagram(String s,String s1) 
	{
		boolean anagram =true;
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				anagram=false;
				break;
			}
		}
		return anagram;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 String s = sc.nextLine();
		 System.out.println("Enter given string: ");
		 String s1 = sc.nextLine();
		 if(isAnagram(s,s1))
		 {
			 System.out.println("Anagram String");
		 }
		 else
		 {
			 System.out.println("Not Anagram string");
		 }
	}

}
