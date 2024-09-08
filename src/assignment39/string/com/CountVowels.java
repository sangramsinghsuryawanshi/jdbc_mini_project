/*
 * 2. Write a program that takes in a string and counts the number of vowels in it.
 */
package assignment39.string.com;

import java.util.Scanner;

public class CountVowels 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 String s = sc.nextLine();
		 char ch[]=s.toCharArray();
		 int cnt=0;
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			 {
				 cnt++;
			 }
		 }
		 System.out.println("Given number of vowel is: "+cnt);
		 
	}

}
