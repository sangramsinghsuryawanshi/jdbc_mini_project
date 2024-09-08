/*
 * 6. Write a program that takes in a string and removes all the vowels from it.
 */
package assignment39.string.com;

import java.util.Scanner;

public class RemoveAllVowels 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 StringBuilder s = new StringBuilder(sc.nextLine());
		 int cnt=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			 {
				 s.deleteCharAt(i);
			 }
		 }
		 for(int i=0;i<s.length();i++)
		 {
			 System.out.print(s.charAt(i));
		 }
			
	}

}
