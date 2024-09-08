/*
 * 4. Write a program that takes in a string and finds the longest word in it.
 */
package assignment39.string.com;

import java.util.Scanner;

public class LongestWord 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter given string: ");
		 String s = sc.nextLine();
		 String str[]=s.split(" ");
		 int max=0;
		 String temp=null;
		 for(int i=0;i<str.length;i++)
		 {
			 if(str[i].length()>max)
			 {
				 max=str[i].length();
				 temp=str[i];
			 }
		 }
		 System.out.println("Longest word is: "+temp);
	}

}
